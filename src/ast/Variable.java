package ast;

public class Variable extends Expression {
    private String id;

    public Variable(String id) {
        this.id = id;
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        return context.getVariable(this.id);
    }

    @Override
    public String toString() {
        return this.id;
    }
}
