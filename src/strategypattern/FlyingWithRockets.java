package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class FlyingWithRockets implements FlyBeahavior {
    @Override
    public void fly() {
        System.out.println("flying with rocket");
    }
}
