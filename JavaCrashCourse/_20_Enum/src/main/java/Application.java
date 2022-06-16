

public class Application {

    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUSE = 3;

    public enum Animal {

        DOG,  // Auto set id 0
        CAT,  // Auto set id 1
        MOUSE  // Auto set id 2
    }

    public enum CarMakers {

        BMW("Germany"),  // Auto set id 0
        MERCEDES("Germany"),  // Auto set id 1
        SEAT("Spain");  // Auto set id 2

        // We can add private variables and methods inside. We need to close the last enum item with a semicolon
        private String country;

        // If adding methods with arguments, those must be defined when listing the Enum items
        private CarMakers(String country) {
            this.country = country;
        }
         public String getCountry() {
            return country;
         }
    }




    public static void main(String[] args) {

        // The main problem os this approach is that animal can be referenced to any variable across the code
        int animal = CAT;
        print_animal(animal);

        // We want to bound the animal references to a certain lis of elements -> Enum
        Animal animal_enum = Animal.CAT;
        print_animal(animal_enum.ordinal());  // Ordinal returns the integer ID, otherwise, function arg type should be Animal
        System.out.println(animal_enum.name());  // Converts Enum key to string

        Animal animal_enum2 = Animal.valueOf("DOG");
        System.out.println(animal_enum2);

        // Each element inside the enum is a class itself
        System.out.println(Animal.MOUSE instanceof Animal);

        CarMakers my_car = CarMakers.MERCEDES;
        System.out.println(my_car.getCountry());
        System.out.println(CarMakers.SEAT.getCountry());
        CarMakers my_car2 = CarMakers.valueOf("BMW");
        System.out.println(my_car2);

    }

    public static void print_animal(int animal_id) {
        switch (animal_id) {
            case DOG:
                System.out.println("Is a dog");
                break;
            case CAT:
                System.out.println("Is a cat");
                break;
            case MOUSE:
                System.out.println("Is a mouse");
                break;
        }
    }
}
