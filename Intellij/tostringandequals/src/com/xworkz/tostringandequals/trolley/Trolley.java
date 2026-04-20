package com.xworkz.tostringandequals.trolley;

public class Trolley {

    String color;
    int capacity;
    int wheelsCount;

    public Trolley(String color, int capacity, int wheelsCount)
    {
        this.color = color;
        this.capacity = capacity;
        this.wheelsCount = wheelsCount;
    }

    public String toString()
    {
        return "Color: " + color + ", Capacity: " + capacity + ", Wheels: " + wheelsCount;
    }

    public boolean equals(Object obj)
    {
        Trolley leftSide = this;

        if(obj instanceof Trolley)
        {
            Trolley rightSide = (Trolley)obj;

            if(leftSide.color.equals(rightSide.color) &&
                    leftSide.capacity == rightSide.capacity &&
                    leftSide.wheelsCount == rightSide.wheelsCount)
            {
                return true;
            }
        }
        return false;
    }
}
