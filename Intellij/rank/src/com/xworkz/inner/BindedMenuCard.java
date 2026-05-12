package com.xworkz.inner;

public class BindedMenuCard implements MenuCard{

    @Override
    public String[] getItems(int id, String itemName) {

        System.out.println("Item Id : "+id);
        System.out.println("Item Name : "+itemName);

        return new String[]{"Fried Rice","Noodles","Pizza","Burger"};
    }
}
