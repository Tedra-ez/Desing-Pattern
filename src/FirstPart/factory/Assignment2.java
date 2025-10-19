package FirstPart.factory;

import FirstPart.factory.factorymethod.*;
import FirstPart.factory.abstractfactory.*;

public class Assignment2 {
    public static void main(String[] args) {
        runFactoryMethodDemo();
        runAbstractFactoryDemo();
    }

    private static void runFactoryMethodDemo() {
        System.out.println("=== Factory Method Demo ===");
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        roadLogistics.planDelivery();
        seaLogistics.planDelivery();
    }

    private static void runAbstractFactoryDemo() {
        System.out.println("\n=== Abstract Factory Demo ===");
        GuiFactory factory = new WindowsFactory(); // try MacFactory

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }
}