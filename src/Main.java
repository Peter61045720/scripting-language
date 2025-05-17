import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String src = """
        int starttime;
        int sum;
        int x;
        starttime = TIME;
        sum = 0;
        for (x=0; x<10; x=x+1) {
            sum = sum + x;
        }
        print(sum);
        print(TIME - starttime);
        """;

        CharStream inputStream = CharStreams.fromString(src);
        ScriptingLanguageLexer lexer = new ScriptingLanguageLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScriptingLanguageParser parser = new ScriptingLanguageParser(tokens);
        parser.start();
    }
}