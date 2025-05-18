package ast;

public class Ternary extends Expression {
    private Expression condition;
    private Expression trueExpression;
    private Expression falseExpression;

    public Ternary(Expression condition, Expression trueExpression, Expression falseExpression) {
        this.condition = condition;
        this.trueExpression = trueExpression;
        this.falseExpression = falseExpression;
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        Value value = this.condition.evaluate(context);

        if (value.getValue() != 0) {
            return this.trueExpression.evaluate(context);
        } else {
            return this.falseExpression.evaluate(context);
        }
    }

    @Override
    public String toString() {
        return this.condition.toString() + " ? " + this.trueExpression.toString() + " : " + this.falseExpression.toString();
    }
}
