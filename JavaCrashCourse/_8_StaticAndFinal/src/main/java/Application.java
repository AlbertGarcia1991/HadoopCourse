class Thing {
    public String name;  // Non-static variables are instances since each instance of the object have its own copy of the variable
    public static String description; // Static variables belongs to the class and all instances share its value

    // Similary, we can create static methods that belongs to the parent class and not to the instances
    public static void showDescription() {
        System.out.println(description);
    }

    public static void showName() {
//        System.out.println(name);  // However, static methods can only access to static variables and not to non-static ones
    }
}

class ThingThatCounts {
    public static int countInstances = 0;
    public int uid = 0;

    public ThingThatCounts() {
        uid = countInstances;
        countInstances++;
    }

    public void howManyInstances() {
        System.out.println("Number of instances created: " + countInstances + ". My ID is " + uid);
    }
}

public class Application {
    public static void main(String[] args) {



        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        // While for non-static variables, each instance of the object can have different values
        thing1.name = "Bob";
        thing2.name = "Alice";
        System.out.println(thing1.name);
        System.out.println(thing2.name);

        Thing.description = "I am a thing";

        System.out.println(Thing.description);  // Is recommended to access static variables by the global class name
        System.out.println(thing1.description);
        System.out.println(thing2.description);

        // When changing the static value for one instance, it changes for all of them
        thing1.description = "New thing";

        System.out.println(thing1.description);
        System.out.println(thing2.description);

        // Static method can be accessed by the name of the class or by each instance of that class name. The former is recommended
        Thing.showDescription();
        thing1.showDescription();

        /*
        Main uses of static:
         - Constants for all instances of the class to prevent from changing the value, we add also 'final' before the
            static:
                                        public final static double PI = 3.1415;
         - Count the number of instances of the object you are creating a constructor that updated the value each time.
            Very useful to give a unique ID to each instance ->not static ID variable initialized with the counter value
            inside constructor.
         */

        ThingThatCounts counter1 = new ThingThatCounts();
        counter1.howManyInstances();
        ThingThatCounts counter2 = new ThingThatCounts();
        counter2.howManyInstances();
        counter1.howManyInstances();

    }
}
