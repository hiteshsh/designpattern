package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking Quacking");
    }
}
