public class Application {

    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Car car1 = new Car();
        Machine machine2 = new Machine();
        Car car2 = new Car();

        machine1.describeYourself();
        machine2.describeYourself();
        car1.describeYourself();
        car2.describeYourself();

        System.out.println(car2.colour);  // Since colour has not been initialized, is assigned to null
        car2.colour = "green";
        System.out.println(car2.colour);  // Now has the colour initialized

        Car car3 = car2;
        car3.describeYourself();
        System.out.println(car3.colour);  // Since mapped to car2 object, they are the same object with two different names
        car3.colour = "blue";  // Changing the colour of one instance, change for both
        System.out.println(car3.colour);
        System.out.println(car2.colour);
        car2.colour = "black";
        System.out.println(car3.colour);

        // Polymorphism is creating objects of one class by reference to objects of another class
        // This only works if the type of the new instance is a parent class form the assigned objects
        Machine car4 = car1;  // Since Car is a subclass of Machine, we can create car objects with Machine type

        // However, attributes and methods ob the parent class are the only created since this is defined by the given
        // type (Machine) when creating the object
        car2.accelerate();
        System.out.println(car2.uid);
        System.out.println(car4.uid);

        // ERROR because car4 is a Car object morphed to Machine, so only Machine methods/attributes are accessible
//        car4.accelerate();
//        car4.colour;

        // However, methods and attributes that exists on the parent Machine class, since the object was mapped to the
        // subclass Car, it has the Car values and overridden methods
        car4.describeYourself();  // Is a Car not a Machine!!



    }
}
