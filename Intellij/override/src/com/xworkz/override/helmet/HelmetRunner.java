package com.xworkz.override.helmet;

public class HelmetRunner {

    public static void main(String[] args) {
        String[] features = {"Strong", "Lightweight", "Comfort"};

        Company company = new Company("Vega", "India");

        Helmet helmet = new Helmet("Vega", 58, 1500.0, features, HelmetType.FULL_FACE, company);
        SafetyHelmet helmet1= new SafetyHelmet("Axor", 60, 2000.0, features, HelmetType.MODULAR, company, true, "Fiber");

        helmet.wear();
        helmet.remove();
        System.out.println(helmet);

        helmet1.wear();
        helmet1.remove();
        helmet1.showMaterial();
        System.out.println(helmet1);
    }
}
