// While a class can only extends one parent class, but can implement as many
// interfaces as desired
public class Person implements Info, SayGoodbye {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there!");
    }

    @Override
    public void showInfo() {
        System.out.println("I am " + name);
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye!!");
    }
}
