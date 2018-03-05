package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("Creating Windows button");
    }
}
