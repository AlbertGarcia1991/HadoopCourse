// Main class must have the same name as the filename <filename>.class
public class Application {

    // Every JAVA program must have the main method as entry point
    public static void main(String[] args){
        // Built-in variable data-types (primitive)

        boolean variable_boolean; // Declaration of the variable
        variable_boolean = true; // Variable initialization

        // Initialization and declaration in one line
        char variable_char = 'a';  // Chars initialization requires the value between simple quotes (not double!)

        int variable_integer;  // 32 bits
        variable_integer = 10;  // Variable initialization
        short variable_short; // 16 bits
        long variable_long; // 64 bits

        float variable_float = 7.32f;  // 32 bits - To initialize floats is required the 'f' after the numerical value
        double variable_double = 1.55621; // 64 bits

        byte variable_byte; // 8 bits

        // Function to output text on the terminal (inherit from build-in JAVA18 System library
        System.out.println(variable_integer);
        System.out.println(variable_byte);  // Throws ERROR because the variable has not been initialized
    }
}