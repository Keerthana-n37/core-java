package com.xworkz.override.plate;

public class DiningPlate extends Plate {

        boolean isMicrowaveSafe;
        String design;

        DiningPlate(String color, int diameter, double price, String[] plateMaterial, PlateMaterial material, Manufacturer manufacturer, boolean isMicrowaveSafe, String design) {
            super(color, diameter, price, plateMaterial, material, manufacturer);
            this.isMicrowaveSafe = isMicrowaveSafe;
            this.design = design;
        }

        void use() {
            System.out.println("Using dining plate");
        }

        void clean() {
            System.out.println("Cleaning dining plate");
        }

        void showDesign() {
            System.out.println("Design: " + design);
        }

        public String toString() {
            return "DiningPlate{isMicrowaveSafe=" + isMicrowaveSafe +
                    ", design='" + design + "'} " + super.toString();
        }
}
