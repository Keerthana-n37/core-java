package com.workz.inner;

public class ShoppingAppRunner {
    public static void main(String[] args) {
        ShoppingApp shoppingApp=new AmazonApp();

        shoppingApp.addToCart();
        shoppingApp.orderProduct();
        shoppingApp.wishlist();
        shoppingApp.trackOrder();
        ShoppingApp.shoppingDetails();
    }
}
