package SecondPart.Facade;

public class KaspiNotification implements IDevice {
    @Override
    public void on() {
        System.out.println("3. Включить уведомление ");
    }

    @Override
    public void off() {
        System.out.println("2. Отключить уведомление ");
    }

    public void getNotification() {
        System.out.println("4. Получение уведомления ");
    }

    public void removeNotification() {
        System.out.println("1. Убрать уведомление ️");
    }
}