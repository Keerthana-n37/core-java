package com.xworkz.tostringandequals.diamond;

public class Diamond {

    String colorType;
    double weight;
    int price;

    public Diamond(String colorType, double weight, int price)
    {
        this.colorType = colorType;
        this.weight = weight;
        this.price = price;
    }

    public String toString()
    {
        return "Color: " + colorType + ", Weight: " + weight + ", Price: " + price;
    }

    public boolean equals(Object obj)
    {
        Diamond leftSide = this;

        if(obj instanceof Diamond)
        {
            Diamond rightSide = (Diamond)obj;

            if(leftSide.colorType.equals(rightSide.colorType) &&
                    leftSide.weight == rightSide.weight &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return false;
    }
}
