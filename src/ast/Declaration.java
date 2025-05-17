package ast;

public class Declaration extends Statement {
    private String type;
    private String id;

    public Declaration(RuntimeContext context, String type, String id) {
        super(context);
        this.type = type;
        this.id = id;
    }

    @Override
    public void execute() {
        this.context.addVariable(this.type, this.id);
    }

    @Override
    public String toString() {
        return "Declaration{" + "type=" + this.type + ", id=" +  this.id + "}";
    }
}
