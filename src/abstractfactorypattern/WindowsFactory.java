package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class WindowsFactory implements UserInterfaceFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new WindowsDropdown();
    }
}
