package ast;

import java.util.Locale;
import java.util.Scanner;

public class Scan extends Statement {
    private String id;

    public Scan(RuntimeContext context, String id) {
        super(context);
        this.id = id;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Value value = context.getVariable(id);
        this.context.setVariable(id, new Value(value.getType(), scanner.nextDouble()));
    }

    @Override
    public String toString() {
        return "scan" + id + " " + context.getVariable(id);
    }
}
