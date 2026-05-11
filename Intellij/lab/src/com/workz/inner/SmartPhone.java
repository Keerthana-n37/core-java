package com.workz.inner;

public interface SmartPhone
{
    String brand="oneplus";
    int ram=12;
    int batteryCapacity=7000;

    void call();
    void browse();

    default void playMusic()
    {
        System.out.println("Playing music in Smartphone");
    }

    default void charge()
    {
        System.out.println("Executing charge method in smartPhone");
    }

    static void phoneInfo()
    {
        System.out.println("Executing phoneInfo in Smartphone");
    }
}
