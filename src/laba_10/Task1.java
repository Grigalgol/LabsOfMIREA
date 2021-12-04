package laba_10;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] arg = {"1", "2", "3", "4", "5"};

        List<String> list = new LinkedList<>();

        for(int i = 0; i < arg.length; i++) {
            list.add(arg[i]);
        }

        for(String item: list) {
            System.out.println(item);
        }

    }
}
