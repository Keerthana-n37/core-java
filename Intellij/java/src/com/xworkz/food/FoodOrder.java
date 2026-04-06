package com.xworkz.food;

public class FoodOrder {

    String item;

    FoodOrder(String item)
    {
        this.item=item;
    }

    public  void placeOrder()
    {
        System.out.printf("Order placed for: "+item);
    }
}
