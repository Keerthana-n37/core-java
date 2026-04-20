package com.xworkz.tostringandequals.battery;

public class Battery {

    String type;
    int capacity;
    String brand;

    public Battery(String type, int capacity, String brand)
    {
        this.type = type;
        this.capacity = capacity;
        this.brand = brand;
    }

    public String toString()
    {
        return "Type: " + type + ", Capacity: " + capacity + ", Brand: " + brand;
    }

    public boolean equals(Object obj)
    {
        Battery leftSide = this;

        if(obj instanceof Battery)
        {
            Battery rightSide = (Battery)obj;

            if(leftSide.type.equals(rightSide.type) &&
                    leftSide.capacity == rightSide.capacity &&
                    leftSide.brand.equals(rightSide.brand))
            {
                return true;
            }
        }
        return false;
    }
}
