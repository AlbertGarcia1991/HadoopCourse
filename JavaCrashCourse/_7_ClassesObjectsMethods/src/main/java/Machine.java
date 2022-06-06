public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start(); // Abstract methods has the same signature as Interfaces
    public abstract void stop();

    // We can create a routine of abstract methods (or not) in the abstract class anyway
    public void run() {
        start();
        stop();
    }

    /*
    Main differences or case-uses between abstract classes and interfaces are that when creating abstract classes we
    are doing a very strict requirement that any subclass must implement those methods. On the other hand, an interface
    is more flexible about which methods should be overridden when creating the child class. In other words, when we
    are extending an abstract class we are ensuring that the child class is a subclass of the parent one. Instances are
    more like templates that mean that the child class is related in a certain degree to the parent class.
     */
}
