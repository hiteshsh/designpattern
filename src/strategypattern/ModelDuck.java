package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBeahavior= new NoFly();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
