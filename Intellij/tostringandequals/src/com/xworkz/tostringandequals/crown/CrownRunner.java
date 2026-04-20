package com.xworkz.tostringandequals.crown;

public class CrownRunner {

    public static void main(String[] args)
    {
        Crown crown1 = new Crown("Gold", 500, "Royal");
        Crown crown2 = new Crown("Silver", 300, "Simple");
        Crown crown3 = new Crown("Gold", 500, "Royal");

        System.out.println(crown3);
        System.out.println(crown2);
        System.out.println(crown1);
        boolean check = crown1.equals(crown3);
        System.out.println("check = " + check);
    }
}
