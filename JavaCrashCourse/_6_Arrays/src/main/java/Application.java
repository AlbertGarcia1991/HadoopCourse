public class Application {
    public static void main(String[] args) {

        int[] values;  // Array of integers without given length. In this way we are creating a pointer
        values = new int[3];  // We indicate to create 3 integer slots at the address of values

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);  // Java, unlike C/C++, gives a default value of 0 to all elements of an array when declaring it

        values[1] = 10;
        System.out.println(values[1]);

        int[] unbounded_values = {2};
        System.out.println("Unbounded " + unbounded_values[0]);

        // The square bracket can be also written after the variable name (this si C style, in Java is preferred the
        // brackets just after the type), and can be initialized in one line using curly brackets
        int moreValues[] = {2, 3, 4};
        for (int i=0; i<3; i++)
            System.out.println(moreValues[i]);

        // ARRAYS OF STRINGS
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "Albert.";
        words[2] = "How are you?";

        // This is an easier way of iterate through an array
        String[] fruits = {"apple", "orange", "banana", "pear"};
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // In this case, since we are creating an array of objects (String is a class) and not primitives, instead of
        // being initialized to 0 by default, it will be initialized to null (is the 0 for addresses)
        String[] texts = new String[2];
        System.out.println(texts[0]);

        // MULTI-DIMENSIONAL ARRAYS
        int[][] bidimensionalArray = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int i=0; i<bidimensionalArray.length; i++) {  // Length attribute return the number of elements in the first dimension (2)
            for (int j=0; j<bidimensionalArray[i].length; j++) {  // We can access to the second dimension (3) using something like this
                System.out.println(bidimensionalArray[i][j]);
            }
        }

    }
}
