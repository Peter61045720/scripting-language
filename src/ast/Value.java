package ast;

public class Value {
    private final String type;
    private double value;

    public Value(String type, double value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value + "";
    }
}
