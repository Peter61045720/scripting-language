package ast;

public class Time extends Expression {
    private Value value;

    public Time() {
        this.value = new Value("int", System.currentTimeMillis() / 1000.0);
    }

    @Override
    public Value evaluate(RuntimeContext context) {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
