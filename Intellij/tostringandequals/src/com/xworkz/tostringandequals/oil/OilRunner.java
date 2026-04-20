package com.xworkz.tostringandequals.oil;

public class OilRunner {

    public static void main(String[] args)
    {
        Oil oil1 = new Oil("Sunflower", 150, 2);
        Oil oil2 = new Oil("Groundnut", 180, 1);
        Oil oil3 = new Oil("Sunflower", 150, 2);

        System.out.println(oil1);
        System.out.println(oil2);
        System.out.println(oil3);
        boolean check = oil1.equals(oil3);
        System.out.println("check = " + check);
    }
}
