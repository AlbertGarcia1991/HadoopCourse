// On main App we need to import the desired packages using convention [package_name].[sub_package_name].[...].[Method_name];
import ocean.Fish;
import ocean.Seaweed;

public class Application {

    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed seaweed = new Seaweed();
    }

}
