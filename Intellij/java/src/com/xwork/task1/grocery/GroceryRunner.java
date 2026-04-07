package com.xwork.task1.grocery;

public class GroceryRunner {

    public static void main(String[] args)
    {
        Grocery[] groceryArray = new Grocery[5];
        StoreGrocery storeGrocery = new StoreGrocery(groceryArray);

        Grocery grocery1 = new Grocery();
        grocery1.id = 1;
        grocery1.itemName = "Rice";
        grocery1.price = 50;
        grocery1.quantity = 10;
        grocery1.brand = "IndiaGate";

        Grocery grocery2 = new Grocery();
        grocery2.id = 2;
        grocery2.itemName = "Oil";
        grocery2.price = 120;
        grocery2.quantity = 5;
        grocery2.brand = "Fortune";

        Grocery grocery3 = new Grocery();
        grocery3.id = 3;
        grocery3.itemName = "Sugar";
        grocery3.price = 40;
        grocery3.quantity = 8;
        grocery3.brand = "Madhur";

        System.out.println("Storing the grocery details");
        storeGrocery.storeGrocery(grocery1);
        storeGrocery.storeGrocery(grocery2);
        storeGrocery.storeGrocery(grocery3);

        System.out.println("Search by item name");
        storeGrocery.searchByName("Rice");

        System.out.println("Update item name");
        storeGrocery.update("Sugar", "Brown Sugar");
    }
}
