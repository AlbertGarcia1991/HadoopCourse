import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.text.ParseException;
import java.util.Scanner;

public class Application {

    // Exceptions are a major part of Java and what give to a piece of code a distinctive quality. The idea is when an
    // error happens, instead of stopping running we try to capture it and do something depending on the error.
    // There are two ways of doing this task:
    //  1) throw keyword: after the class name we write 'throw' and the type of error we want to capture
    //     (e.g. FileNotFoundException).
    //  2) try-catch clauses: here we can specify on each case what to do if the error happens
    //
    // Also, there are two kinds of exceptions in Java:
    //  A) Checked Exceptions: the code does not compile if we do not handle them.
    //  B) Run-Time Exception: the code compiles and throws the exceptions when reaches the line that throws it. However,
    //     we can still catch them via the Exception subclass RunTimeException (or any of its subclasses).
    public static void main(String[] args) throws IOException, ParseException {

        // Simplest way of reading a text file line by line using Scanner object
        String filename = "C:\\Users\\AlbertGarciaPlaza\\Desktop\\personal\\HadoopCourse\\JavaCrashCourse\\" +
                "_18_FileHandlerAndExceptions\\src\\main\\text_sample.txt"; // Require double backslash as folder sep
        File textFile = new File(filename);  // Create file object passing the filename as argument
        Scanner in = new Scanner(textFile);
        int count = 1;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println("Read line " + count + ": " + line);
            count++;
        }
        in.close(); // We need to close the file always

        String filename2 = "text_sample2.txt"; // Relative path to the root folder of the project (same level as src dir)
        File textFile2 = new File(filename2);  // Create file object passing the filename as argument
        Scanner in2 = new Scanner(textFile2);
        count = 1;
        while(in2.hasNextLine()) {
            String line = in2.nextLine();
            System.out.println("Read line " + count + ": " + line);
            count++;
        }
        in2.close(); // We need to close the file always

        // A more powerful way of working with files is through FileReader objects
        filename2 = "text_sample23.txt";
        try {
            FileReader fr = new FileReader(filename2); // This throws an error since the specified file does not exist
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + filename2.toString());  // If the given error is raised, we run this code
            e.printStackTrace();  // This method prints the trace of the exception
        }

        // To make this work we need to wrap it around try-catch or to throw in the main class def. Otherwise, even the
        // exception is captured inside the objects, the error will be thrown to the main class and this will fail
        openFile(filename2);

        // Multiple exceptions handling
        Test test = new Test();
        test.run(3);  // We need to add all exceptions that the method can throw in the main class exceptions defs

        Test test2 = new Test();  // We can also catch them using try-catch clauses
        try {
            test2.run(5);
        } catch (IOException e1) {
            System.out.println("IO exception");
        } catch (ParseException e2) {
            System.out.println("Parse exception");
        }  // When following this approach, if one exception is a subclass of another also thrown, we need to define the first catch from the most subclass

        Test test3 = new Test();
        try {
            test3.run(0);
        } catch (IOException | ParseException e) {  // Catch multiple exceptions inside one single statement
            System.out.println("Multiple catching");
        }

        Test test4 = new Test();
        try {
            test4.run(-40);
        } catch (Exception e) {  // Or catch them from the parent generic Exception class
            System.out.println("Generic exception catching");
        }

    }

    public static FileReader openFile(String src) throws FileNotFoundException {
        File file = new File(src);
        FileReader fr = new FileReader(file);
        return fr;
    }

}
