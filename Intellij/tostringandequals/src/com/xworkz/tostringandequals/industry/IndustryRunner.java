package com.xworkz.tostringandequals.industry;

public class IndustryRunner {

    public static void main(String[] args)
    {
        Industry industry1 = new Industry("Infosys", "Bangalore", 1000);
        Industry industry2 = new Industry("TCS", "Hyderabad", 2000);
        Industry industry3 = new Industry("Infosys", "Bangalore", 1000);

        System.out.println(industry1);
        System.out.println(industry2);
        System.out.println(industry3);
        boolean check = industry1.equals(industry3);
        System.out.println("check = " + check);
    }
}
