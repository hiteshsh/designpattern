package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard= new MallardDuck();
        mallard.performFly();
        mallard.setFlyBeahavior(new NoFly());
        mallard.performFly();
        mallard.performQuack();
    }
}
