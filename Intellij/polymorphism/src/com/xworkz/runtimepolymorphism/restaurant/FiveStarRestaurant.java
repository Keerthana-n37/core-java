package com.xworkz.runtimepolymorphism.restaurant;

public class FiveStarRestaurant extends Restaurant{

    @Override
    public void biryaniPrice() {
        System.out.println("Price:500 with premium quality");
    }
}
