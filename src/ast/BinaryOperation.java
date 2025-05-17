package ast;

public class BinaryOperation extends Expression {
    private String operator;
    private Expression lhs;
    private Expression rhs;

    public BinaryOperation(String operator, Expression lhs, Expression rhs) {
        this.operator = operator;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        Value lhsValue = this.lhs.evaluate(context);
        Value rhsValue = this.rhs.evaluate(context);

        switch (this.operator) {
            case "+": return new Value(lhsValue.getType(), lhsValue.getValue() + rhsValue.getValue());
            case "-": return new Value(lhsValue.getType(), lhsValue.getValue() - rhsValue.getValue());
            case "*": return new Value(lhsValue.getType(), lhsValue.getValue() * rhsValue.getValue());
            case "/": return new Value(lhsValue.getType(), lhsValue.getValue() / rhsValue.getValue());
            case "==": return new Value(lhsValue.getType(), lhsValue.getValue() == rhsValue.getValue() ? 1 : 0);
            case "!=": return new Value(lhsValue.getType(), lhsValue.getValue() != rhsValue.getValue() ? 1 : 0);
            case "||": return new Value(lhsValue.getType(), lhsValue.getValue() != 0 || rhsValue.getValue() != 0 ? 1 : 0);
            case "&&": return new Value(lhsValue.getType(), lhsValue.getValue() != 0 && rhsValue.getValue() != 0 ? 1 : 0);
            case "<": return new Value(lhsValue.getType(), lhsValue.getValue() < rhsValue.getValue() ? 1 : 0);
            case ">": return new Value(lhsValue.getType(), lhsValue.getValue() > rhsValue.getValue() ? 1 : 0);
            default: return null;
        }
    }

    @Override
    public String toString() {
        return this.lhs.toString() + " " + this.operator + " " + this.rhs.toString();
    }
}
