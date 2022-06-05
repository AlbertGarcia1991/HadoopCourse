public class Machine {

    public static int countInstances = 0;
    public int uid;


    public void describeYourself() {
        System.out.println("I am a Machine ID " + this.uid);
    }

    public Machine() {
        uid = countInstances;
        countInstances++;
    }
}
