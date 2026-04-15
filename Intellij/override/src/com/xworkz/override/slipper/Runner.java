package com.xworkz.override.slipper;

public class Runner {

    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("ABC Corp", "India");

        String[] features = {"Soft", "Lightweight", "Comfortable"};

        Slipper slipper = new Slipper(9, "Black", 499.99, features, Brand.NIKE, manufacturer);

        String[] features1={"Durable", "Grip"};

        SportSlipper sport = new SportSlipper(10, "Blue", 799.99, features1, Brand.PUMA, manufacturer, true, "Running");

        slipper.wear();
        slipper.remove();
        System.out.println(slipper);

        System.out.println("------------------");

        sport.wear();
        sport.remove();
        sport.showType();
        System.out.println(sport);
    }
}
