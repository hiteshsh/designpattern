package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class NoFly implements FlyBeahavior {
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
