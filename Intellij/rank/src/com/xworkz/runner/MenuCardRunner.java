package com.xworkz.runner;

import com.xworkz.inner.BindedMenuCard;
import com.xworkz.inner.MenuCard;
import com.xworkz.usage.Kitchen;

public class MenuCardRunner {

    public static void main(String[] args) {

        MenuCard menuCard=new BindedMenuCard();

        Kitchen kitchen=new Kitchen();

        kitchen.setMenuCard(menuCard);

        kitchen.showItems();
    }
}
