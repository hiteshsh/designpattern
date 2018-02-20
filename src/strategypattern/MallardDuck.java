package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBeahavior= new FlyingWithRockets();
        quackBehavior= new Quack();
    }
    @Override
    public void display() {
        System.out.println("mallard duck");
    }

}
