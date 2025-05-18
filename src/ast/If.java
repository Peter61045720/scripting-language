package ast;

public class If extends Statement {
    private Expression condition;
    private Statement trueBranch;
    private Statement falseBranch;

    public If(RuntimeContext context, Expression condition, Statement trueBranch, Statement falseBranch) {
        super(context);
        this.condition = condition;
        this.trueBranch = trueBranch;
        this.falseBranch = falseBranch;
    }

    @Override
    public void execute() {
        Value value = this.condition.evaluate(context);

        if (value.getValue() != 0.0) {
            this.trueBranch.execute();
        } else if (this.falseBranch != null) {
            this.falseBranch.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if ")
                .append(this.condition.toString())
                .append("\nthen\n")
                .append(this.trueBranch.toString());
        if (this.falseBranch != null) {
            sb.append("\nelse\n").append(this.falseBranch.toString());
        }
        return sb.toString();
    }
}
