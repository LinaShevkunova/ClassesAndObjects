package task5_1;

import task5_1.User;

public class UserLoginService {

    public boolean loginIn(User user, String password) {
        if (user.getPassword().equals(password) && user.getTries() > 0) {
            user.newTries();
            System.out.println("Вы вошли!");
            return true;
        } else {
            System.out.print("Ошибка ввода пароля.");
            user.decreaseTries();
            user.blockedUser();
            if (!user.getblockedUser()) {
                int stayTries = user.getTries();
                System.out.println(String.format("У вас осталось %s попыток для входа.", stayTries));
            } else {
                System.out.println("Ваш профиль заблокирован.");
            }
            return false;
        }
    }
}
