public class Application {
    public static void main(String[] args) {

        // WHILE loop
        int rightHandTerm = 10;
        while (0 < rightHandTerm) {
            System.out.println("WHILE loop -> Current value of 'rightHandTerm': " + rightHandTerm);
            rightHandTerm = rightHandTerm - 1;
        }
        System.out.println("\n");  // New line special character

        // FOR loop (we can create an infinite loop using for(;;) expression)
        for (int i=10; i>0; i--) {
            // We can add the variables inside the print statement using printf function, and adding type specifiers
            // inside the text string and then adding the variables to substitute in the same order that they appear
            // on the test string.
            System.out.printf("FOR loop -> Current value of 'i': %d\n", i);

            /*
            Text specifiers:
                - %%: print the '%' symbol
                - %x: integer hex
                - %t: time and date
                - %s: string
                - %n: new line character
                - %o: octal integer
                - %f: decimal floating-point
                - %e: scientific notation
                - %g: causes formatter to either %f or %e
                - %h: hash code
                - %d: integer
                - %c: character
                - %b: boolean

                - % d: adds and space before the digit that will be filler if contains a '-' negative sign. Alignment
                - %+d: adds the symbol '+' before any positive number. Alignment
                - %(d: negative numbers between parenthesis and without '-' symbol

                - %4.5f: float showing only 4 integer digits and 5 decimal digits

             */
        }
        System.out.println("\n");

        // IF-ELSE condition
        for (int i=10; i>0; i--) {
            if (i % 2 == 0) {
                System.out.printf("IF condition -> Current value of 'i': %d -> Even\n", i);
            }
            else if (i == 7) {
                System.out.printf("IF condition -> Current value of 'i': %d -> Seven -> CONTINUE\n", i);
                continue;  // continue keyword stops the current iteration of the parent loop (for) when reached
            }
            else if (i == 5) {
                System.out.printf("IF condition -> Current value of 'i': %d -> Five\n", i);
            }
            else if (i == 3) {
                System.out.printf("IF condition -> Current value of 'i': %d -> Three -> BREAK\n", i);
                break;  // break keyword stops the parent loop (for) when reached
            }
            else {
                System.out.printf("IF condition -> Current value of 'i': %d -> Odd\n", i);
            }
        }
    }
}
