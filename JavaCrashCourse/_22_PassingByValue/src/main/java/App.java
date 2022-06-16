public class App {
    public static void main(String[] args) {
        App app = new App();  // Required to call non-static methods from the same main class

        int value = 7;
        System.out.println("1. Value is " + value);
        app.show(value);
        System.out.println("4. Value is " + value);  // Value has not changes on the global scope

        Person person = new Person("Albert");
        System.out.println("1. Name is " + person);
        app.show_name(person);
        System.out.println("4. Name is " + person);
        app.change_name(person);
        System.out.println("5. Name is " + person);

    }

    public void show(int value) {
        System.out.println("2. Value is " + value);
        value = 8;  // We change the value only inside the method scope (local)
        System.out.println("3. Value is " + value);
    }

    public void show_name(Person person) {
        System.out.println("2. Name is " + person);
        person = new Person("Carlos");
        System.out.println("3. Name is " + person);
    }

    public void change_name(Person person) {
        person.setName("Armand"); // Now we have changed the original name on the global scope
        person = new Person("Julia");

        // However, if we run the method after creating a new reference for person, it will change only to that reference and not the global instance
        person.setName("Marcela");
        System.out.println(person);

    }
}
