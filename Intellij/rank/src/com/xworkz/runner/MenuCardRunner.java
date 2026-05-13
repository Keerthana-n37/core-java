package com.xworkz.runner;

import com.xworkz.inner.BindedMenuCard;
import com.xworkz.inner.MenuCard;
import com.xworkz.outer.VegMenuCard;
import com.xworkz.usage.Kitchen;

public class MenuCardRunner {

    public static void main(String[] args) {

        MenuCard menuCard=new BindedMenuCard();

        Kitchen kitchen=new Kitchen();

        kitchen.setMenuCard(menuCard);

        kitchen.showItems();

        MenuCard menuCard1=new VegMenuCard();

        Kitchen kitchen1=new Kitchen();

        kitchen1.setMenuCard(menuCard1);

        kitchen1.showItems();
    }
}
