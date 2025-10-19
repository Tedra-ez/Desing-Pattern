package SecondPart.Facade;

public class KaspiFacade {
<<<<<<< HEAD
    private Phone phone;
    private KaspiApp kaspi;
    private KaspiNotification notification;

    public KaspiFacade(Phone phone, KaspiApp kaspi, KaspiNotification notification) {
        this.phone = phone;
        this.kaspi = kaspi;
        this.notification = notification;
    }

    public void startKaspi() {
        System.out.println("=== Kaspi запуск ===");
        phone.on();
        kaspi.on();
        notification.on();
        notification.getNotification();
        System.out.println();
    }

    public void stopKaspi() {
        System.out.println("=== Kaspi завершение ===");
        notification.removeNotification();
        notification.off();
        kaspi.off();
        phone.off();
=======
    private KaspiDatabase database;
    private KaspiLogger logger;

    public KaspiFacade() {
        this.database = new KaspiDatabase();
        this.logger = new KaspiLogger();
    }

    public void registerUser(String name, String phone) {
        logger.log("Регистрация нового клиента: " + name);
        KaspiUser user = new KaspiUser(name, phone);
        database.addUser(user);
        logger.log("Регистрация завершена ✅");
    }

    public void searchUser(String name) {
        logger.log("Запрос на поиск клиента: " + name);
        KaspiUser user = database.findUser(name);
        if (user != null) {
            logger.log("Клиент найден: " + user.getName() + " (" + user.getPhone() + ")");
        } else {
            logger.log("Клиент с именем " + name + " не найден ❌");
        }
>>>>>>> 77d0458 (commit)
    }
}