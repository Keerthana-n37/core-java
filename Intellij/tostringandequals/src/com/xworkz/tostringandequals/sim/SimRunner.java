package com.xworkz.tostringandequals.sim;

public class SimRunner {

    public static void main(String[] args)
    {
        Sim sim1 = new Sim("Jio", 9876543210L, true);
        Sim sim2 = new Sim("Airtel", 9123456780L, false);
        Sim sim3 = new Sim("Jio", 9876543210L, true);

        System.out.println(sim1);
        System.out.println(sim2);
        System.out.println(sim3);
        boolean check = sim1.equals(sim3);
        System.out.println("check = " + check);
    }
}
