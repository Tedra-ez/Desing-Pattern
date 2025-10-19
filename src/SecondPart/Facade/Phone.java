package SecondPart.Facade;

public class Phone implements IDevice {
    @Override
    public void on() {
        System.out.println("1. Включить телефон ");
    }

    @Override
    public void off() {
        System.out.println("4. Выключить телефон ");
    }
}