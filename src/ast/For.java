package ast;

public class For extends Statement {
    private Statement initialization;
    private Expression condition;
    private Statement increment;
    private Statement forBody;

    public For(RuntimeContext context, Statement initialization, Expression condition, Statement increment, Statement forBody) {
        super(context);
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.forBody = forBody;
    }

    @Override
    public void execute() {
        this.initialization.execute();
        Value value = this.condition.evaluate(context);

        while (value.getValue() != 0.0) {
            this.forBody.execute();
            this.increment.execute();
            value = this.condition.evaluate(context);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("for ")
                .append(this.initialization.toString())
                .append(", ")
                .append(this.condition.toString())
                .append(", ")
                .append(this.increment.toString())
                .append("\nthen\n")
                .append(this.forBody.toString());
        return sb.toString();
    }
}
