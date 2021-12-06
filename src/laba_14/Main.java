package laba_14;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Stack<Double> stack = new Stack<>();
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            if (isNumber(strArray[i])) {
                stack.push(Double.parseDouble(strArray[i]));
            } else {
                try {
                    double a = stack.pop();
                    double b = stack.pop();

                    switch (strArray[i]) {
                        case "+":
                            stack.push(b + a);
                            break;
                        case "-":
                            stack.push(b-a);
                            break;
                        case "*":
                            stack.push(b*a);
                            break;
                        case "/":
                            stack.push(b/a);
                            break;
                    }
                }
                catch (EmptyStackException e) {
                    System.out.println("Невозможно извлечь элемент из стека");
                }
            }

        }
        if(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}