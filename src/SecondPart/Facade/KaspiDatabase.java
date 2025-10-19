package SecondPart.Facade;

import java.util.ArrayList;
import java.util.List;

public class KaspiDatabase {
    private List<KaspiUser> users = new ArrayList<>();

    public void addUser(KaspiUser user) {
        users.add(user);
        System.out.println("Пользователь " + user.getName() + " добавлен в базу Kaspi ✅");
    }

    public KaspiUser findUser(String name) {
        for (KaspiUser user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                System.out.println("Пользователь найден: " + user.getName());
                return user;
            }
        }
        System.out.println("Пользователь не найден ❌");
        return null;
    }
}