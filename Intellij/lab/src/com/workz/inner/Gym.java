package com.workz.inner;

public interface Gym {

    String gymName="Gold Gym";
    int trainers=10;
    String trainerName="Akarsh";

    void workout();
    void rest();

    default void cardio()
    {
        System.out.println("Executing cardio in gym");
    }

    default void yoga()
    {
        System.out.println("Executing yoga session in gym");
    }

    static void gymInfo()
    {
        System.out.println("Executing gymInfo in Gym");
    }
}
