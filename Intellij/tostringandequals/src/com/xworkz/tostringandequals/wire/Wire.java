package com.xworkz.tostringandequals.wire;

public class Wire {

    double length;
    String materialType;
    double price;

    public Wire(double length, String materialType, double price)
    {
        this.length = length;
        this.materialType = materialType;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Length: " + length + ", Material: " + materialType + ", Price: " + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        Wire leftSide = this;

        if(obj instanceof Wire)
        {
            Wire rightSide = (Wire)obj;

            if(leftSide.length == rightSide.length &&
                    leftSide.materialType.equals(rightSide.materialType) &&
                    leftSide.price == rightSide.price)
            {
                return true;
            }
        }
        return false;
    }
}
