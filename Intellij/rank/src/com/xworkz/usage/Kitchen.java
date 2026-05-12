package com.xworkz.usage;

import com.xworkz.inner.MenuCard;

public class Kitchen {

    MenuCard menuCard;

    public void setMenuCard(MenuCard menuCard)
    {
        this.menuCard=menuCard;
    }

    public void showItems()
    {
        System.out.println("Running showItems method in Kitchen");

        if(this.menuCard!=null)
        {
            String[] items=this.menuCard.getItems(101,"Fried Rice");

            for(String item:items)
            {
                System.out.println(item);
            }
        }
    }
}
