package laba_4;

public class Banana implements Priceable{

    public Banana(double price) {
        this.price = price;
    }

    private double price;

    @Override
    public double getPrice() {
        return price;
    }
}
