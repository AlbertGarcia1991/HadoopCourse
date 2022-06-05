import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        // In JAVA, Strings are immutable (cannot change its value)
        String info = "";  // we are creating an empty string
        info += "My name is Bob.";
        // we are creating a new string with hols the sum of the previous info and current value, and labeling it with
        // the same 'info' word
        info += " ";
        info += "I am a builder";
        System.out.println(info);
        // Here, we have allocated 4 String memory spaces -> Very inefficient!

        // To do it correctly, we create a StringBuilder object. This object has methods to operate with the String without
        // creating copies of the object in memory
        StringBuilder info_eff = new StringBuilder("");
        info_eff.append("My name is Bob.");
        info_eff.append(" I am a builder.");
        info_eff.append(2);
        System.out.println(info_eff);
        System.out.println(info_eff.toString());  // toString() methods ensures that the content is printable
        // Also, all objects in Java has the .toString() method. Is very common to override that method and indicate the
        // behaviour when printing an instance:

        randomObject objectToString1 = new randomObject();
        randomObject objectToString2 = new randomObject();
        System.out.println(objectToString1);
        System.out.println(objectToString2);

        // StringBuilder is more lightweight but not thread-safe. The same object but thread-safe is called StringBuffer

    }

    private static class randomObject {

        public int id = 0;
        public static int counter = 0;

        public randomObject() {
            this.id = counter++;
        }

//        @Override
//        public String toString() {
//            StringBuilder sb = new StringBuilder();
//            sb.append("ID: " + id);
//            return sb.toString();
//        }

        // Format method on a String works very similar to Python's format
        @Override
        public String toString() {
            return String.format("ID: %04d", this.id);
        }
    }
}
