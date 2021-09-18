package laba_4;

public class FruitsShop {

    public static void main(String[] args) {
        Apple apple = new Apple(20);
        Banana banana = new Banana(12);
        Orange orange = new Orange(25.6);
        System.out.println(apple.getPrice());
        System.out.println(banana.getPrice());
        System.out.println(orange.getPrice());

    }
}
