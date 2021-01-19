package task5_2;

/* NAMES
   minimum = 3 simbols
   maximum = 120 simbols

  AGES
  minimum = 0
  maximum = 120
    */

public class UserValidationService {
    public static final String VALID_FIRST_NAME= "Имя: верное значение";
    public static final String VALID_LAST_NAME = "Фамилия: верное значение";
    public static final String VALID_AGE = "Возраст: верное значение";

    public String validationOfFirstName(User user) {
        String firstName = user.getFirstName();
        int nameLength = firstName.length();
        if (nameLength > 3 && nameLength < 15) {
            return VALID_FIRST_NAME;
        } else {
            return UserValidationException.INVALID_FIRST_NAME;
        }
    }
    public String validationOfLastName(User user) {
        String lastName = user.getLastName();
        int nameLength = lastName.length();
        if (nameLength > 3 && nameLength < 15) {
            return VALID_LAST_NAME;
        } else {
            return UserValidationException.INVALID_LAST_NAME;
        }
    }
    public String validationOfAge(User user) {
        int age = user.getAge();
        if (age >= 0 && age <= 120) {
            return VALID_AGE;
        } else {
            return UserValidationException.INVALID_AGE;
        }
    }
}
