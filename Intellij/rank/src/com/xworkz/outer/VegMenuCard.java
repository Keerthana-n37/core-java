package com.xworkz.outer;

import com.xworkz.inner.MenuCard;

public class VegMenuCard implements MenuCard {

    @Override
    public String[] getItems(int id, String itemName) {

        System.out.println("VegMenuCard id:"+id);
        System.out.println("VegMenuCard itemName:"+itemName);
        return new String[]{"Ghee Rice","Idli","Dosa"};
    }
}
