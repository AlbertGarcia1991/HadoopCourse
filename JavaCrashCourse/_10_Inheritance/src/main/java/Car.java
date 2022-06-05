public class Car extends Machine{

    public void wipeWindShield() {
        System.out.println("Wiping windshield.");
    }

    public void stop() {
        System.out.println("Car stopped.");
        super.stop(); // 'super' keywords calls methods/attributes from the parent class even overridden for current instance
    }
}
