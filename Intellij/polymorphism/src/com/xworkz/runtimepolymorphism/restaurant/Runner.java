package com.xworkz.runtimepolymorphism.restaurant;

public class Runner {

    public static void main(String[] args) {

        FiveStarRestaurant restaurant = new FiveStarRestaurant();
        restaurant.biryaniPrice();

        Restaurant restaurant1 = new FiveStarRestaurant();
        restaurant1.biryaniPrice();

        Restaurant restaurant2= new Restaurant();
        restaurant2.biryaniPrice();
    }
}
