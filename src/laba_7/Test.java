package laba_7;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<String>();
        myArrayList.add("Ваня");
        myArrayList.add("Петя");
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println("---------------");
        myArrayList.add("Гоша");
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        System.out.println("---------------");
        myArrayList.delete(1);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
    }
}
