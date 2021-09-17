package laba_3;

public class Plate extends Dish{
    private String shape; //форма
    private String size;

    public Plate(String material, String shape, String size) {
        super(material);
        this.shape = shape;
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println(getShape() + " тарелка. Размер " + getSize() + ". Материал - " + super.getMaterial());
    }
}
