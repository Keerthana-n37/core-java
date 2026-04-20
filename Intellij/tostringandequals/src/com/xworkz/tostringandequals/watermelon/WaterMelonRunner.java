package com.xworkz.tostringandequals.watermelon;

public class WaterMelonRunner {

    public static void main(String[] args)
    {
        WaterMelon waterMelon1 = new WaterMelon("Green", 5.5, "Sweet");
        WaterMelon waterMelon2 = new WaterMelon("Red", 6.0, "Medium");
        WaterMelon waterMelon3 = new WaterMelon("Green", 5.5, "Sweet");

        boolean check = waterMelon1.equals(waterMelon3);
        System.out.println("check = " + check);
    }
}
