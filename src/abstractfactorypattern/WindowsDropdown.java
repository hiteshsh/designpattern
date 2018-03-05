package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class WindowsDropdown implements Dropdown {
    @Override
    public void createDropdown() {
        System.out.println("Creating windows dropdown");
    }
}
