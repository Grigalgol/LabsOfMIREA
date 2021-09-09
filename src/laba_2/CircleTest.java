package laba_2;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.0);
        circle.setX(2.0);
        circle.setY(1.5);
        System.out.println("Абцисса центра окружности: " + circle.getX());
        System.out.println("Ордината центра окружности: " + circle.getY());
        System.out.println("Радиус окружности: " + circle.getRadius());
    }
}
