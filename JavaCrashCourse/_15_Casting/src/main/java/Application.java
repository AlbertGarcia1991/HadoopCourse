public class Application {

    public static void main(String[] args) {

        byte valueByte = 86;
        short valueShort = 450;
        int valueInt = 1345;
        long valueLong = 1224354361;

        float valueFloat = 24325.4f;
        double valueDouble = 3243.234;

        // We cast in the same way as in C/C++ via parenthesis
        System.out.printf("%d, %d, %d, %d\n", valueByte, valueShort, valueInt, (int) valueFloat);
        System.out.printf("%f, %f\n", valueFloat, valueDouble);

        // When upsampling, is not required the specifier. However, downsampling in this way is forbidden
        float valueFloatFromInt = valueInt;
        System.out.println(valueFloatFromInt);  // integer automatically casted to float

        // Careful about overflowing when downsampling
        byte byteOverflowed = (byte) 400;
        System.out.println(byteOverflowed);


    }
}
