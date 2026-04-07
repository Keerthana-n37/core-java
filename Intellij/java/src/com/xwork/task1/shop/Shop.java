package com.xwork.task1.shop;

public class Shop {

    int shopId;
    String name;
    String location;
    String owner;
    int employees;

    void displayInfo() {
        System.out.println("Shop ID: " + this.shopId);
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Owner: " + this.owner);
        System.out.println("Employees: " + this.employees);
    }
}
