import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        File file = new File("new_file.txt");

        // Similar to reading files, but we use Writer objects
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            if (file.exists()  && !file.isDirectory()) {
                bw.append("New line appended");  // Does not work as expected: erases the file and writes that line only
                bw.newLine();
            }
            else {
                bw.write("New line number 1");
                bw.newLine();
                bw.write("New line appended number 2");
            }

        } catch (IOException e) {
            System.out.println("Unable to write the file " + file.toString());
        }

    }

}
