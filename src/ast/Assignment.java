package ast;

public class Assignment extends Statement {
    private String id;
    private Expression expression;

    public Assignment(RuntimeContext context, String id, Expression expression) {
        super(context);
        this.id = id;
        this.expression = expression;
    }

    @Override
    public void execute() {
        this.context.setVariable(this.id, this.expression.evaluate(context));
    }

    @Override
    public String toString() {
        return "Assignment{id=" + this.id + ", expression=" + this.expression.toString() + "}";
    }
}
