package laba_4;

public class Orange implements Priceable{

    private double price;

    public Orange(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
