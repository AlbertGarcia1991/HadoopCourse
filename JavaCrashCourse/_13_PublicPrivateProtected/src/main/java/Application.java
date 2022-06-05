import machine.*;

public class Application {

    public static void main(String[] args) {

        // We can r/w public variables from inside and outside the class
        Plant plant1 = new Plant();
        System.out.println(plant1.name);
        plant1.name = "John";
        System.out.println(plant1.name);

        // However, if the variable is final we cannot change its value
        System.out.println(plant1.ID);
        System.out.println(Plant.ID);  // Since is static, it has the same value for all instances

        // Private variables cannot be accessed from outside the class, even from child classes
        System.out.println(plant1.getAge());  // We use get/set to r/w private variables

        // We can access to protected variables only if they are in the same package
        Oak oak1 = new Oak();
        System.out.println(oak1.size);
        System.out.println(plant1.size);
        oak1.size = "small";
        plant1.size = "smaller";
        System.out.println(oak1.size);
        System.out.println(plant1.size);

        // If the protected variables are in a different package..
        Machine machine = new Machine();
        Car car = new Car();
        System.out.println(machine.getColour());  // We need set/get to work with those protected variables
        System.out.println(car.getColour());
    }
}
