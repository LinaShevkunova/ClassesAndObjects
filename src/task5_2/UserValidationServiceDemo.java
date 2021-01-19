package task5_2;

public class UserValidationServiceDemo {
    public static void main(String[] args) {
        User user = new User("Lina", "Mars", 22);
        User invalidUserFirstName2 = new User("Li");
        User invalidUserFirstName16 = new User("qwerty1234567890");
        User invalidUserLastName2 = new User("Ma");
        User invalidUserLastName16 = new User("qwerty1234567890");
        User invalidUserAgeNegative1 = new User(-1);
        User invalidUserAge121 = new User(121);
        UserValidationService validationService = new UserValidationService();
        System.out.println("Case 1");
        System.out.println("..............");
        System.out.println(validationService.validationOfFirstName(user));
        System.out.println("\nCase 2");
        System.out.println("..............");
        System.out.println(validationService.validationOfFirstName(invalidUserFirstName2));
        System.out.println("\nCase 3");
        System.out.println("..............");
        System.out.println(validationService.validationOfFirstName(invalidUserFirstName16));
        System.out.println("\nCase 4");
        System.out.println("..............");
        System.out.println(validationService.validationOfLastName(user));
        System.out.println("\nCase 5");
        System.out.println("..............");
        System.out.println(validationService.validationOfLastName(invalidUserLastName2));
        System.out.println("\nCase 6");
        System.out.println("..............");
        System.out.println(validationService.validationOfLastName(invalidUserLastName16));
        System.out.println("\nCase 7");
        System.out.println("..............");
        System.out.println(validationService.validationOfAge(user));
        System.out.println("\nCase 8");
        System.out.println("..............");
        System.out.println(validationService.validationOfAge(invalidUserAgeNegative1));
        System.out.println("\nCase 9");
        System.out.println("..............");
        System.out.println(validationService.validationOfAge(invalidUserAge121));
    }
}
