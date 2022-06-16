import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println("Writing objects...");

        Person mike = new Person(542, "Mike");
        Person john = new Person(76, "John");

        System.out.println(mike);
        System.out.println(john);

        try(FileOutputStream fs = new FileOutputStream("people.bin")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(john);

            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}