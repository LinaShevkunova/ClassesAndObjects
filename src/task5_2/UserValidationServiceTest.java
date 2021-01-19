package task5_2;

public class UserValidationServiceTest {
    public static void minAgeTest() {
        User user = new User(-1);
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfAge(user);
        String expectedValidationMessage = UserValidationException.INVALID_AGE;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed min age test");
        }
    }

    public static void maxAgeTest() {
        User user = new User(121);
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfAge(user);
        String expectedValidationMessage = UserValidationException.INVALID_AGE;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed max age test");
        }
    }

    public static void shortFirstNameTest() {
        User user = new User("Li");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfFirstName(user);
        String expectedValidationMessage = UserValidationException.INVALID_FIRST_NAME;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed short FirstName test");
        }
    }

    public static void longFirstNameTest() {
        User user = new User("qwerty1234567890");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfFirstName(user);
        String expectedValidationMessage = UserValidationException.INVALID_FIRST_NAME;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed long FirstName test");
        }
    }
    public static void shortLastNameTest() {
        User user = new User("Ma");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfLastName(user);
        String expectedValidationMessage = UserValidationException.INVALID_LAST_NAME;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed short LastName test");
        }
    }

    public static void longLastNameTest() {
        User user = new User("qwerty1234567890");
        UserValidationService validationService = new UserValidationService();
        String actualValidationMessage = validationService.validationOfLastName(user);
        String expectedValidationMessage = UserValidationException.INVALID_LAST_NAME;
        if (expectedValidationMessage.equals(actualValidationMessage)) {
            System.out.println("Passed Long LastName test");
        }
    }
}
