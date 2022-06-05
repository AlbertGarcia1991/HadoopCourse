public class Application {
    public static void main(String[] args) {
        // String is not a primitive data-type but a class contained inside the built-int library
        // Is created equivalent to an array of chars e.g. char myText = {'H', 'e', 'l', 'l', 'o'};
        String myText = "Hello";

        System.out.println(myText);

        String emptySpace = " ";
        String myName = "Albert";

        // We can concatenate Strings just with the + operand and storing the result, or just printing the sum
        String greeting = myText + emptySpace + myName;
        System.out.println(greeting);
        System.out.println(myText + emptySpace + myName);
        System.out.println(myText + " " + myName);

        // We can print variables together with text using the same + operand inside the println function
        int myInteger = 4;
        System.out.println(myText + " " + myInteger);

        double myDouble = 7.8;
        System.out.println("MyDouble = " + myDouble);

    }
}
