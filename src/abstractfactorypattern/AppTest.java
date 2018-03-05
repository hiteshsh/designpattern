package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class AppTest {

    public static void main(String[] args) {
        UserInterfaceFactory factory= new MacFactory();
        Application application= new Application(factory);
        application.draw();

        UserInterfaceFactory factory1= new WindowsFactory();
        Application application1= new Application(factory1);
        application1.draw();
    }

}
