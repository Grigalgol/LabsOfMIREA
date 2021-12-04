package laba_11;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(Integer item: list) {
            System.out.println(item);
        }

        MyList myList = new MyList(list);
        System.out.println("List with Iterator");
        while(myList.hasNext()) {
            System.out.println(myList.getObject());
        }
    }
}
