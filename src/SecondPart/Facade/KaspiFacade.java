package SecondPart.Facade;

public class KaspiFacade {
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
    }
}