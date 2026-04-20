package com.xworkz.tostringandequals.watermelon;

public class WaterMelon {

    String outerColor;
    double weight;
    String tasteType;

    public WaterMelon(String outerColor, double weight, String tasteType)
    {
        this.outerColor = outerColor;
        this.weight = weight;
        this.tasteType = tasteType;
    }

    @Override
    public String toString()
    {
        return "Color: " + outerColor + ", Weight: " + weight + ", Taste: " + tasteType;
    }

    @Override
    public boolean equals(Object obj)
    {
        WaterMelon leftSide = this;

        if(obj instanceof WaterMelon)
        {
            WaterMelon rightSide = (WaterMelon)obj;

            if(leftSide.outerColor.equals(rightSide.outerColor) &&
                    leftSide.weight == rightSide.weight &&
                    leftSide.tasteType.equals(rightSide.tasteType))
            {
                return true;
            }
        }
        return false;
    }
}
