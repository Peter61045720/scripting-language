package ast;

public class ExpressionStatement extends Statement {
    private Expression expression;

    public ExpressionStatement(RuntimeContext context, Expression expression) {
        super(context);
        this.expression = expression;
    }

    @Override
    public void execute() {
        this.expression.evaluate(context);
    }

    @Override
    public String toString() {
        return expression.toString() + "\n";
    }
}
