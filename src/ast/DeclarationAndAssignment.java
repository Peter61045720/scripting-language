package ast;

public class DeclarationAndAssignment extends Statement {
    private String type;
    private String id;
    private Expression expression;

    public DeclarationAndAssignment(RuntimeContext context, String type, String id, Expression expression) {
        super(context);
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    @Override
    public void execute() {
        this.context.addVariable(type, id);
        this.context.setVariable(id, this.expression.evaluate(context));
    }

    @Override
    public String toString() {
        return "DeclarationAndAssignment{" + "type=" + this.type + ", id=" +  this.id + ", expression=" + this.expression.toString() + "}";
    }
}
