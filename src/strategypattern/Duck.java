package strategypattern;

/**
 * Created by hiteshs on 2/9/18.
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBeahavior flyBeahavior;
   public abstract void display();
   public void swim(){
       System.out.println("Swimming");
   }
   public void performQuack(){
       quackBehavior.quack();
   }
   public void performFly(){
       flyBeahavior.fly();
   }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBeahavior(FlyBeahavior flyBeahavior) {
        this.flyBeahavior = flyBeahavior;
    }
}
