package com.xworkz.override.plate;

public class PlateRunner {

    public static void main(String[] args) {
        String[] plateMaterial = {"CERAMIC", "GLASS", "STEEL"};

        Manufacturer manufacturer = new Manufacturer("Bamboo Pvt Ltd", "Bangalore");

        Plate plate = new Plate("White", 10, 199.0, plateMaterial, PlateMaterial.CERAMIC, manufacturer);
        DiningPlate diningPlate = new DiningPlate("Blue", 12, 299.0, plateMaterial, PlateMaterial.GLASS, manufacturer, true, "Modern");

        plate.use();
        plate.clean();
        System.out.println(plate);

        diningPlate.use();
        diningPlate.clean();
        diningPlate.showDesign();
        System.out.println(diningPlate);
    }
}
