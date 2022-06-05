// A class is a blueprint to create objects
class Person {
    // Classes can contain two different kinds of things: data (instance variables defining states) and methods
    // (subroutines/functions)
    // 1. Instances variables
    private String name;
    int age;
    float height;

    // This kind of function is called a setter. It is used to keep the instance variables "private" and set their
    // values using auxiliar functions. This is called encapsulation. When the set variable is declared 'private' like
    // in this case, it can not be accessed just writing a point after the instance name (as we do with age and height).
    // In the same way that has a setter, usually also has a getter.
    void setName(String newName) {
        name = newName;
    }
    String getName() {
        return name;
    }

    // If for any reason we use the name of one of the attributes as the argument of one method, the only way to access
    // to the instance variable is using 'this' keyword to indicate that the variable belongs to the object and not to
    // the local scope
    void printThisAndOtherName(String name) {
        System.out.println(name);  // This is referring to the name passed as argument
        System.out.println(this.name);  // This is referring to the object attribute name
    }

    // 2. Methods
    void presentYourself() {
        System.out.println("Hi, my name is " + name + ". I am " + age + " years old.");
    }

    boolean isLegallyAdult() {
        if (age >= 18) {
            return true;
        }
        return false;
    }

    int ageDifference(int otherAge) {
        return age - otherAge;
    }
}

// CLASSES WITH CONSTRUCTORS
class Car {
    private String brand;
    private int price = 0;

    // A constructor is a method with no return type and same name than the parent class. It is invoked everytime we
    // create a new instance
    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int price) {
        this(brand);  //We can call constructors inside constructors using just this instead of the name. Always must be the first command
        this.price = price;
    }

    // In JAVA we can have methods with the same name but different arguments. When running them, Java will look for the method
    // that matches the given args. Same can be done with the constructors
    public void printBrand() {
        System.out.println(brand);
    }

    public void printBrand(int times) {
        for (int i=1; i<times; i++) {
            System.out.println(brand);
        }
    }
}

// A class defined 'public' must match its name the .java filename. Also, in each file, it can be only one public class.
public class Application {

    // Any Java project must have one and only one main method which will become the entry point on run-time
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Albert");
        person1.age = 30;
        person1.height = 1.76f;

        Person person2 = new Person();
        person1.setName("Ainara");
        person2.age = 6;
        person2.height = 1.26f;

        person1.presentYourself();
        System.out.println(person1.isLegallyAdult());
        person2.presentYourself();
        System.out.println(person2.isLegallyAdult());

        System.out.println(person1.ageDifference(person2.age));

        person1.printThisAndOtherName("Carlos");

        // CONSTRUCTORS
        Car car1 = new Car("Mercedes");  // We can call them in the same way as other objects
        car1.printBrand();
        new Car("BWM");  // Or also we can directly create a new instance without assignation nto a variable

    }
}
