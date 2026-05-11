package com.workz.inner;

public interface College {

    String collegeName="MVJ College";
    int students=2000;
    boolean placement=true;

    void exam();
    void results();

    default void library()
    {
        System.out.println("Executing library in College");
    }

    default void fest()
    {
        System.out.println("Executing fext method in College");
    }

    static void takeClass()
    {
        System.out.println("Executing takeClass in College");
    }
}
