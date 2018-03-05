package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class Application {

    private Button button;
    private Dropdown dropdown;

    public Application(UserInterfaceFactory factory){
        button=factory.createButton();
        dropdown= factory.createDropdown();
    }
    public void draw(){
        button.draw();
        dropdown.createDropdown();
    }
}
