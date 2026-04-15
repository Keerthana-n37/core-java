package com.xworkz.override.belt;

public class BeltRunnner {

    public static void main(String[] args) {
        char[] codes = {'A', 'B', 'C'};

        Brand brand = new Brand("Gucci", "Italy");

        Belt belt= new Belt("Black", 32, 1999.0, codes, BeltStyle.CASUAL, brand);
        DesignerBelt designerBelt= new DesignerBelt("Brown", 34, 2999.0, codes, BeltStyle.PARTY, brand, true, "Leather");

        belt.wear();
        belt.remove();
        System.out.println(belt);

        designerBelt.wear();
        designerBelt.remove();
        designerBelt.showMaterial();
        System.out.println(designerBelt);
    }
}
