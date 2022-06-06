/*
Anonymous classes are usually implemented to extend an existing class or to create an Interface
 */
class Machine {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface Plant {
    public void grow();
}

public class Application {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.start();

        // Say we want to override the start() method from Machine. We can create a child class that extends Machine and
        // has the new start() implementation, or we can override it when instantiating the object:
        Machine machine2 = new Machine() {
            @Override
            public void start() {
                System.out.println("Start method overridden!");
            }
        };
        machine2.start();
        // This new object is a child class of Machine that does not have a name -> Anonymous. There is no way to create
        // a new object of the same type (one-shot objects)

        // We can use anonymous classes to implemented methods from Interfaces
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing...");
            }
        };
        plant1.grow();
    }

}
