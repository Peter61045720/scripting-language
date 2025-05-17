package ast;

public abstract class Statement {
    protected RuntimeContext context = null;

    protected Statement(RuntimeContext context) {
        this.context = context;
    }

    public abstract void execute();

    @Override
    public abstract String toString();
}
