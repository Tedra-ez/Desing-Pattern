package SecondPart.Facade;

public class KaspiApp implements IDevice {
    @Override
    public void on() {
        System.out.println("2. Открыть Kaspi приложение ");
    }

    @Override
    public void off() {
        System.out.println("3. Закрыть Kaspi приложение ");
    }
}