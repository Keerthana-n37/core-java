package com.xworkz.override.belt;

public class DesignerBelt extends Belt{

    boolean branded;
    String material;

    DesignerBelt(String color, int size, double price, char[] codes, BeltStyle style, Brand brand, boolean branded, String material) {
        super(color, size, price, codes, style, brand);
        this.branded = branded;
        this.material = material;
    }

    void wear() {
        System.out.println("Wearing designer belt");
    }

    void remove() {
        System.out.println("Removing designer belt");
    }

    void showMaterial() {
        System.out.println("Material: " + material);
    }

    public String toString() {
        return "DesignerBelt{branded=" + branded +
                ", material='" + material + "'} " + super.toString();
    }
}
