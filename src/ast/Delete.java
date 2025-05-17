package ast;

public class Delete extends Statement {
    private String id;

    public Delete(RuntimeContext context, String id) {
        super(context);
        this.id = id;
    }

    @Override
    public void execute() {
        this.context.deleteVariable(this.id);
    }

    @Override
    public String toString() {
        return "delete " + this.id;
    }
}
