public class Application {

    public static void main(String[] args) {

        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Bob");
        person1.greet();

        mach1.showInfo();
        person1.showInfo();

        person1.sayGoodbye();

        // We can do the following because Machine implements Info interface
        Info info = new Machine();
        System.out.println(info);  // Prints pointer to reference of Machine
        info.showInfo(); // So the pointer has the same methods as Machine

        Info info2 = person1;  // Same here, but now the pointer to the already created instance person1
        outputInfo(info2);

    }

    private static void outputInfo(Info info) {
        info.showInfo();
    }

}
