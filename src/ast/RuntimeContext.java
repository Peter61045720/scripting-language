package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuntimeContext {
    private List<Statement> statements = new ArrayList<Statement>();
    private Map<String, Value> variables = new HashMap<String, Value>();

    public void addVariable(String type, String id) {
        if (this.variables.containsKey(id)) {
            throw new RuntimeException("Variable with id '" + id + "' already exists");
        }

        this.variables.put(id, new Value(type, 0.0));
    }

    public Value getVariable(String id) {
        Value value = this.variables.get(id);

        if (value == null) {
            throw new RuntimeException("Variable with id '" + id + "' not found");
        }

        return value;
    }

    public void setVariable(String id, Value newValue) {
        Value oldValue = this.variables.get(id);

        if (oldValue == null) {
            throw new RuntimeException("Variable with id '" + id + "' not found");
        }

        if (oldValue.getType().equals(newValue.getType())) {
            oldValue.setValue(newValue.getValue());
        } else if (oldValue.getType().equals("double") && newValue.getType().equals("int")) {
            oldValue.setValue(newValue.getValue());
        } else {
            throw new RuntimeException("Incompatible types: possible lossy conversion from double to int");
        }
    }

    public void deleteVariable(String id) {
        this.variables.remove(id);
    }

    public void addStatements(Sequence sequence) {
        this.statements = sequence.getStatements();
    }

    public void execute() {
        for (Statement statement : this.statements) {
            statement.execute();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Statement statement : this.statements) {
            sb.append(statement.toString());
        }
        return sb.toString();
    }
}
