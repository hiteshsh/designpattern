package factorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class PersonalComputer extends Computer {
    @Override
    void getComputer() {
        this.ram="2 GB";
        this.hdd="250 GB";
        System.out.println(this.ram +","+this.hdd);
    }
}
