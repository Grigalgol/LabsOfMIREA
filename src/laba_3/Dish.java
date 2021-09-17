package laba_3;

public abstract class Dish {
    private String material;
    public Dish(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void displayInfo();
}
