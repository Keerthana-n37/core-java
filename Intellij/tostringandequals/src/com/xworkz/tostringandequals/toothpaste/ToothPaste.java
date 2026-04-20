package com.xworkz.tostringandequals.toothpaste;

public class ToothPaste {

    String brandName;
    String taste;
    int cost;

    public ToothPaste(String brandName, String taste, int cost)
    {
        this.brandName = brandName;
        this.taste = taste;
        this.cost = cost;
    }

    public String toString()
    {
        return "Brand: " + brandName + ", Taste: " + taste + ", Cost: " + cost;
    }

    public boolean equals(Object obj)
    {
        ToothPaste leftSide = this;

        if(obj instanceof ToothPaste)
        {
            ToothPaste rightSide = (ToothPaste)obj;

            if(leftSide.brandName.equals(rightSide.brandName) &&
                    leftSide.taste.equals(rightSide.taste) &&
                    leftSide.cost == rightSide.cost)
            {
                return true;
            }
        }
        return false;
    }
}
