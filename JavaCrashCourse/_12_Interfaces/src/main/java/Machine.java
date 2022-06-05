// When a class implements a Interface, it must override all methods from ir
public class Machine implements Info{

    private int id = 7;

    public void start() {
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is " + id);
    }
}
