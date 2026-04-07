package com.xwork.task1.shop;

public class ShopRunner {

    public static void main(String[] args)
    {
        Shop[] shopArray = new Shop[5];
        ShopStore storeShop = new ShopStore(shopArray);

        Shop shop1 = new Shop();
        shop1.shopId = 1;
        shop1.name = "ABC Store";
        shop1.location = "Bangalore";
        shop1.owner = "Ramesh";
        shop1.employees = 10;

        Shop shop2 = new Shop();
        shop2.shopId = 2;
        shop2.name = "Fashion Hub";
        shop2.location = "Hyderabad";
        shop2.owner = "Suresh";
        shop2.employees = 8;

        Shop shop3 = new Shop();
        shop3.shopId = 3;
        shop3.name = "Tech World";
        shop3.location = "Chennai";
        shop3.owner = "Mahesh";
        shop3.employees = 15;

        System.out.println("Storing shop details");
        storeShop.storeShop(shop1);
        storeShop.storeShop(shop2);
        storeShop.storeShop(shop3);

        System.out.println("Search by name");
        storeShop.searchByName("ABC Store");

        System.out.println("Update by name");
        storeShop.update("Tech World", "Tech Galaxy");
    }
}
