package com.xwork.task1.grocery;

public class Grocery {

    int id;
    String itemName;
    double price;
    int quantity;
    String brand;

    Grocery()
    {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    void displayInfo()
    {
        System.out.println("Executing displayInfo in Grocery");
        System.out.println("ID: " + this.id);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Brand: " + this.brand);
    }
}
