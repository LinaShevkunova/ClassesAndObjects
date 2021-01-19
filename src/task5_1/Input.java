package task5_1;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString() {
        String input = scanner.nextLine();
        if (input.isBlank()) {
            System.out.println("Данные должны быть заполнены. Повторите ввод.");
            getString();
        }
        return input;
    }
    public static String getString(String text) {
        System.out.println(text);
        return getString();
    }
    public static int getInt() {
        if(scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        System.out.println(String.format("Ввод [%s] не является числом. Повторите ввод.", scanner.next()));
        return getInt();
    }
    public static int getInt(String text){
        System.out.println(text);
        return getInt();
    }
}
