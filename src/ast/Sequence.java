package ast;

import java.util.ArrayList;
import java.util.List;

public class Sequence extends Statement {
    private List<Statement> statements = new ArrayList<Statement>();

    public Sequence(RuntimeContext context) {
        super(context);
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }

    public List<Statement> getStatements() {
        return this.statements;
    }

    @Override
    public void execute() {
        for (Statement statement : this.statements) {
            statement.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Statement statement : this.statements) {
            sb.append(statement.toString()).append("\n");
        }
        return sb.toString();
    }
}
