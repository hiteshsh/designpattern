package factorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class Server extends Computer {
    @Override
    void getComputer() {
        this.hdd="25 GB";
        this.ram= "8 GB";
        System.out.println(this.ram +","+this.hdd);
    }
}
