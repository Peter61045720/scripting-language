package ast;

public class Decrement extends Expression {
    private String id;

    public Decrement(String id) {
        this.id = id;
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        Value oldValue = context.getVariable(id);
        Value newValue = new Value(oldValue.getType(), oldValue.getValue() - 1);
        context.setVariable(this.id, newValue);
        return newValue;
    }

    @Override
    public String toString() {
        return this.id + "--\n";
    }
}
