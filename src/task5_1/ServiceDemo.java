package task5_1;

public class ServiceDemo {

    public static void main(String[] args) {
        System.out.println("Введите пароль для входа:");
        User Lina = new User("lina", "mars");
        UserLoginService userLoginService = new UserLoginService();
        while (true) {
            String password = Input.getString();
            userLoginService.loginIn(Lina, password);
        }
    }
}
