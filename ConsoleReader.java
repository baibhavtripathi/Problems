import java.io.Console;
import java.util.Arrays;

/**
 * ConsoleReader
 */
public class ConsoleReader {

    public static void main(String[] args) {
        Console reader = System.console();
        System.out.println(Arrays.toString( reader.readPassword() ));
    }
}