import java.io.IOException;
import java.text.ParseException;

public class Test {
    // We can throw as many exceptions as we want separating them with commas
    public void run(int value) throws IOException, ParseException {
        // If we throw the exception in-code, we need to throw it via de class definition as well
        if (value < 0) {
            throw new IOException();
        }
        else {
            throw new ParseException("Error in command list", 2);
        }
    }
}
