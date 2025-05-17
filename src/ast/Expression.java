package ast;

public abstract class Expression {
    public abstract Value evaluate(RuntimeContext context);

    @Override
    public abstract String toString();
}
