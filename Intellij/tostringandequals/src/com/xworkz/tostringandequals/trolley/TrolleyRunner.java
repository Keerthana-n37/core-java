package com.xworkz.tostringandequals.trolley;

public class TrolleyRunner {

    public static void main(String[] args)
    {
        Trolley trolley1 = new Trolley("Blue", 50, 4);
        Trolley trolley2 = new Trolley("Black", 60, 2);
        Trolley trolley3 = new Trolley("Blue", 50, 4);

        boolean check = trolley1.equals(trolley3);
        System.out.println("check = " + check);
    }
}
