import ast.RuntimeContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String src = """
        int a;
        print(a);               # 0.0
        
        a = 14;
        print(a);               # 14.0
        
        double b = 3.14;
        print(b);               # 3.14
        
        a = a + 100;
        print(a);               # 114.0
        
        b = a - 20;
        print(b);               # 94.0
        
        print(abs(-14));        # 14.0
        
        print(5.5*2);           # 11.0
        
        print(30/5.1);          # 5.882352941176471
        
        print(-255);            # -255.0
        
        print(1 < 2);           # 1.0
        
        print(1 > 2);           # 0.0
        
        print(1 < 2 && 2 < 3);  # 1.0
        
        print(1 > 2 || 1 < 2);  # 1.0
        
        print(TIME);            # 1.747514246139E9 (kb. 2025 május közepe)
        
        print((5+1)*2);         # 12.0
        
        int c;
        print(c);               # 0.0
        scan(c);                # (pl. 156.11)
        print(c);               # 156.11
        
        # int a;                # Exception in thread "main" java.lang.RuntimeException: Variable with id 'a' already exists
        # d = 5;                # Exception in thread "main" java.lang.RuntimeException: Variable with id 'd' not found
        # scan(e);              # Exception in thread "main" java.lang.RuntimeException: Variable with id 'e' not found
        # int e = 3.14;         # Exception in thread "main" java.lang.RuntimeException: Incompatible types: possible lossy conversion from double to int
        """;

        CharStream inputStream = CharStreams.fromString(src);
        ScriptingLanguageLexer lexer = new ScriptingLanguageLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScriptingLanguageParser parser = new ScriptingLanguageParser(tokens);

        RuntimeContext context = new RuntimeContext();
        parser.start(context);
        context.execute();
    }
}