package ast;

public class Constant extends Expression {
    private String literal;
    private Value value;

    public Constant(String type, String literal) {
        this.literal = literal;
        this.value = new Value(type, Double.parseDouble(literal));
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        return this.value;
    }

    @Override
    public String toString() {
        return this.literal;
    }
}
