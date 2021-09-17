package laba_3;

import java.security.spec.RSAOtherPrimeInfo;

public class Glass extends Dish {

    private double volume;
    public Glass(String material, double volume) {
        super(material);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void displayInfo() {
        System.out.println("cтакан объемом " + getVolume() + " литра. Материал - " + super.getMaterial());
    }
}
