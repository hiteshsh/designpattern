package abstractfactorypattern;

/**
 * Created by hiteshs on 3/5/18.
 */
public class MacFactory implements UserInterfaceFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropdown();
    }
}
