package ast;

public class Print extends Statement {
    private final Expression expression;

    public Print(RuntimeContext context, Expression expression) {
        super(context);
        this.expression = expression;
    }

    @Override
    public void execute() {
        System.out.println(expression.evaluate(context));
    }

    @Override
    public String toString() {
        return "print(" + expression.toString() + ")\n";
    }
}
