import java.util.Scanner;  // Importing libraries and classes to show the program where to find them'

public class Application {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // to initialize objects (instances) we need the 'new' keyword

        System.out.println("\nEnter your name: ");
        String userInput = input.nextLine();

        System.out.printf("Hello %s\n", userInput);

        System.out.println("\nEnter your age: ");
        int userAge = input.nextInt();  // We need this method to capture user input integers
        System.out.printf("Your age is %d\n", userAge);  // If we entered a non-integer as inputAge, program will crash

        // DO-WHILE and SWITCH-CASE statements
        int requiredFiveOrSix = 0;
        do {
            System.out.println("\nEnter number five or six: ");
            requiredFiveOrSix = input.nextInt();

            switch (requiredFiveOrSix) {
                case 5:
                    System.out.println("\nThanks for entering 5");
                    break;
                case 6:
                    System.out.println("\nThanks for entering 6");
                    break;
                default:  // default statement is called when no other case is true
                    System.out.println("\nNot a 5 or 6, keep trying!");
                    break;
            }
        }
        while (requiredFiveOrSix != 5 & requiredFiveOrSix != 6);

        do {
            System.out.println("\nEnter number five or six: ");
            requiredFiveOrSix = input.nextInt();

            // A different (modern) of writing switch-case statements
            switch (requiredFiveOrSix) {
                case 5 -> System.out.println("\nThanks for entering 5");
                case 6 -> System.out.println("\nThanks for entering 6");
                default -> System.out.println("\nNot a 5 or 6, keep trying!");
            }
        }
        while (requiredFiveOrSix != 5 & requiredFiveOrSix != 6);
    }
}
