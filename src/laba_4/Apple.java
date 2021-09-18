package laba_4;

public class Apple implements Priceable{
    private double price;

    public Apple(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
