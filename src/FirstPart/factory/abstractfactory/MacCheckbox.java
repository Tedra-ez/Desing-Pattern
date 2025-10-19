package FirstPart.factory.abstractfactory;

public class MacCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("Rendering a Mac checkbox.");
    }
}