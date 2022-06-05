// A generic class is one that can work with other objects, and those objects are defined when instantiating the class

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I am a Machine";
    }
}

class Camera extends Machine {
}

public class Application {

    public static void main(String[] args) {

        // Before Java 5 (no Generics)
        ArrayList list = new ArrayList();
        list.add("Apple");
        list.add("banana");
        list.add(34); // We can add any type inside the ArrayList object
        String fruit = (String) list.get(1);  // Down-casted because .get() returns Object
        System.out.println(fruit);

        // After Java 5 we can use Generics for the task fo restricting the type inside the object
        ArrayList<String> listGeneric = new ArrayList<String>(); // We specify which type to store inside the array
        listGeneric.add("dog");
        listGeneric.add("cat");
        listGeneric.add("elephant");
        String animal = listGeneric.get(2);
        System.out.println(animal);

        // We can define Generic types from any classes
        ArrayList<Machine> cars1 = new ArrayList<Machine>();
        ArrayList<Machine> cars2 = new ArrayList<>(); // After Java 7 is not need to repeat the type at the right-hand side

        // Wildcards
        showList(listGeneric);
        ArrayList<Machine> machines = new ArrayList<>();
        showListFromMachine(machines);  // We need a different function since argument type has changes
        // We can solve that fact and implement a single function adding a wildcard as type
        showListGeneric(listGeneric);
        showListGeneric(machines);
    }

    public static void showList(ArrayList<String> list) {
        for (String element:list) {
            System.out.println(element);
        }
    }

    public static void showListFromMachine(ArrayList<Machine> list) {
        for (Machine element:list) {
            System.out.println(element);
        }
    }

    public static void showListGeneric(ArrayList<?> list) {  // Use question mark to indicate unknown type
        // Since everything is an extension of the superclass Object, the following is always valid
        for (Object element : list) {
            System.out.println((String) element);  // This downcasting is optional depending on the end purpose
        }
    }

    public static void showListGenericExtendsMachine(ArrayList<? extends Machine> list) {
        // This syntax will accept any class of Machine or any of its subclasses
        for (Object element : list) {
            System.out.println(element);
            // Here we can call any attribute or method of the parent class, but any specific from the subclasses
        }
    }

    public static void showListGenericSuperCamera(ArrayList<? super Camera> list) {
        // In this case, we can pass any Camera object or any object of Camera's superclasses
        for (Object element : list) {
            System.out.println(element);
        }
    }
}
