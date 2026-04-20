package com.xworkz.tostringandequals.oil;

public class Oil {
    String oilType;
    int price;
    int litre;

    public Oil(String oilType, int price, int litre)
    {
        this.oilType = oilType;
        this.price = price;
        this.litre = litre;
    }

    public String toString()
    {
        return "Type: " + oilType + ", Price: " + price + ", Litre: " + litre;
    }

    public boolean equals(Object obj)
    {
        Oil leftSide = this;

        if(obj instanceof Oil)
        {
            Oil rightSide = (Oil)obj;

            if(leftSide.oilType.equals(rightSide.oilType) &&
                    leftSide.price == rightSide.price &&
                    leftSide.litre == rightSide.litre)
            {
                return true;
            }
        }
        return false;
    }
}
