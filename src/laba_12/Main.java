package laba_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш пароль: ");
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}$");
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find() ? "Пароль правильный" : "Пароль неправильный");
    }
}
