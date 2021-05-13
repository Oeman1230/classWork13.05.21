import java.io.Console;

public class Main2 {
    public static void main(String[] args)
    {
        Console console = System.console();
        if(console != null)
        {
            String  name = console.readLine("insert name");
            String age = console.readLine("insert age");
            char[] userPassword = console.readPassword("parol");
            console.printf("You inserted name: %s,\n" +
                    "age: %s and password: %s", name, age, new String(userPassword));
        }
    }
}
