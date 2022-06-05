public class Plant {
    public String name;
    protected String size;
    public final static int ID = 8;

    private final int age = 10;

    public int getAge() {
        return this.age;
    }

    public Plant() {
        this.size = "large";
        this.name = "Freddy";
    }
}
