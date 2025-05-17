package ast;

public class UnaryOperation extends Expression {
    private String operator;
    private Expression operand;

    public UnaryOperation(String operator, Expression operand) {
        this.operator = operator;
        this.operand = operand;
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        Value value = this.operand.evaluate(context);

        switch (this.operator) {
            case "-": return new Value(value.getType(), -value.getValue());
            case "abs": return new Value(value.getType(), Math.abs(value.getValue()));
            default: return null;
        }
    }

    @Override
    public String toString() {
        return this.operator + " " + this.operand.toString();
    }
}
