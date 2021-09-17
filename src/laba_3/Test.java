package laba_3;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate("стекло", "круглая", "маленький");
        Glass glass = new Glass("пластик", 0.3);
        Spoon spoon = new Spoon("золото", "чайная");
        plate.displayInfo();
        glass.displayInfo();
        spoon.displayInfo();
    }
}
