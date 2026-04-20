package com.xworkz.tostringandequals.crown;

public class Crown {

    String metalType;
    int weight;
    String style;

    public Crown(String metalType, int weight, String style)
    {
        this.metalType = metalType;
        this.weight = weight;
        this.style = style;
    }

    public String toString()
    {
        return "Metal: " + metalType + ", Weight: " + weight + ", Style: " + style;
    }

    public boolean equals(Object obj)
    {
        Crown leftSide = this;

        if(obj instanceof Crown)
        {
            Crown rightSide = (Crown)obj;

            if(leftSide.metalType.equals(rightSide.metalType) &&
                    leftSide.weight == rightSide.weight &&
                    leftSide.style.equals(rightSide.style))
            {
                return true;
            }
        }
        return false;
    }
}
