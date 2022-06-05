public class Car extends Machine {

    public String colour;

    @Override
    public void describeYourself() {
        System.out.println("I am a Car with Machine ID " + this.uid);
    }

    public void accelerate() {
        System.out.println("This car is accelerating..");
    }

    public void whichColour() {
        System.out.println(colour);
    }
}
