import ast.RuntimeContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        int testIndex = 1;

        while (true) {
            Path testPath = Paths.get("tests/test" + testIndex + ".txt");

            if (!Files.exists(testPath)) {
                break;
            }

            System.out.println("==== Start of Test " + testIndex + " ====");

            try {
                String src = Files.readString(testPath);

                CharStream inputStream = CharStreams.fromString(src);
                ScriptingLanguageLexer lexer = new ScriptingLanguageLexer(inputStream);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ScriptingLanguageParser parser = new ScriptingLanguageParser(tokens);

                RuntimeContext context = new RuntimeContext();
                parser.start(context);
                context.execute();
            } catch (Exception e) {
                System.err.println("Error while running " + testPath + ": " + e.getMessage());
                System.exit(1);
            }

            System.out.println("==== End of Test " + testIndex + " ====\n");
            testIndex++;
        }

        System.out.println("==== All tests finished successfully ====");
    }
}
