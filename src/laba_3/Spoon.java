package laba_3;

public class Spoon extends Dish{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Spoon(String material, String type) {
        super(material);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println(getType() + " ложка. Материал - " + super.getMaterial());
    }
}
