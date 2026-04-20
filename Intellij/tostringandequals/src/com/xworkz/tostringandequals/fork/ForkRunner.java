package com.xworkz.tostringandequals.fork;

public class ForkRunner {
    public static void main(String[] args)
    {
        Fork fork1 = new Fork("Steel", 8, "Silver");
        Fork fork2 = new Fork("Plastic", 6, "White");
        Fork fork3 = new Fork("Steel", 8, "Silver");

        System.out.println(fork1);
        System.out.println(fork2);
        System.out.println(fork3);
        boolean check = fork1.equals(fork3);
        System.out.println("check = " + check);
    }
}
