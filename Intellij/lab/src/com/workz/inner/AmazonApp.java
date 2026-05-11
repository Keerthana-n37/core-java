package com.workz.inner;

public class AmazonApp implements ShoppingApp{

    @Override
    public void addToCart() {
        System.out.println("executing addToCart in AmazonApp");
    }

    @Override
    public void orderProduct() {
        System.out.println("executing orderProduct in AmazonApp");
    }
}
