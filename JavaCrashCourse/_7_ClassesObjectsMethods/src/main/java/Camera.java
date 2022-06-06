public class Camera extends Machine {

    // Abstract methods MUST be overridden
    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
