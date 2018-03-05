package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class MacButton implements Button {
    @Override
    public void draw() {
        System.out.println("Creating Mac button");
    }
}
