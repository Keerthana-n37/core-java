package com.xworkz.tostringandequals.fork;

public class Fork {

    String materialType;
    int size;
    String color;

    public Fork(String materialType, int size, String color)
    {
        this.materialType = materialType;
        this.size = size;
        this.color = color;
    }

    public String toString()
    {
        return "Material: " + materialType + ", Size: " + size + ", Color: " + color;
    }

    public boolean equals(Object obj)
    {
        Fork leftSide = this;

        if(obj instanceof Fork)
        {
            Fork rightSide = (Fork)obj;

            if(leftSide.materialType.equals(rightSide.materialType) &&
                    leftSide.size == rightSide.size &&
                    leftSide.color.equals(rightSide.color))
            {
                return true;
            }
        }
        return false;
    }
}
