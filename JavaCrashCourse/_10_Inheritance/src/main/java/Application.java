import javax.crypto.Mac;

public class Application {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();

        // We can extend all classes that are not final. The new class can also override inherited classes
        Car car1 = new Car();
        car1.start();  // Start method inherit from Machine
        car1.wipeWindShield();  // WipeWindShield method new for Car class
        car1.stop();  // Stop method overridden

        // !! To inherit methods and attributes from a class, they cannot be private. Anything set as private inside Machine
        // will be not accessed from any Car instance

    }
}
