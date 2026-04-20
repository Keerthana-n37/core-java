package com.xworkz.tostringandequals.battery;

public class BatteryRunner {

    public static void main(String[] args)
    {
        Battery battery1 = new Battery("Lithium", 5000, "Duracell");
        Battery battery2 = new Battery("Lead", 3000, "Exide");
        Battery battery3 = new Battery("Lithium", 6000, "Duracell");

        System.out.println(battery1);
        System.out.println(battery2);
        System.out.println(battery3);
        boolean check = battery1.equals(battery3);
        System.out.println("check = " + check);
    }
}
