package com.workz.inner;

public interface Animal {

    String name="Cat";
    int legs=4;
    boolean pet= true;


    void eat();
    void sleep();

    default void sound()
    {
        System.out.println("Execuitng sound in Animal");
    }

    default void jump()
    {
        System.out.println("Executing jump method in Animal");
    }

    static void info(){
        System.out.println("Executing eat method in animal");
    }
}
