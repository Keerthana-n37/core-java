package com.workz.inner;

public interface ShoppingApp {

    int products=100000;
    String name="Amazon";
    boolean cod=true;

    void addToCart();
    void orderProduct();

    default void wishlist()
    {
        System.out.println("Executing wishlist method in ShoppingApp");
    }

    default void trackOrder()
    {
        System.out.println("Executing trackOrder method in ShoppingApp");
    }

    static void shoppingDetails()
    {
        System.out.println("Executing shoppingDetails in ShoppingApp");
    }
}
