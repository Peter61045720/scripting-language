package ast;

public class While extends Statement {
    private Expression condition;
    private Statement statement;

    public While(RuntimeContext context, Expression condition, Statement statement) {
        super(context);
        this.condition = condition;
        this.statement = statement;
    }

    @Override
    public void execute() {
        while (this.condition.evaluate(context).getValue() != 0) {
            this.statement.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("while ")
                .append(this.condition.toString())
                .append("\ndo\n")
                .append(this.statement.toString());
        return sb.toString();
    }
}
