package com.xworkz.tostringandequals.industry;

public class Industry {

    String industryName;
    String place;
    int employeeCount;

    public Industry(String industryName, String place, int employeeCount)
    {
        this.industryName = industryName;
        this.place = place;
        this.employeeCount = employeeCount;
    }

    public String toString()
    {
        return "Name: " + industryName + ", Place: " + place + ", Employees: " + employeeCount;
    }

    public boolean equals(Object obj)
    {
        Industry leftSide = this;

        if(obj instanceof Industry)
        {
            Industry rightSide = (Industry)obj;

            if(leftSide.industryName.equals(rightSide.industryName) &&
                    leftSide.place.equals(rightSide.place) &&
                    leftSide.employeeCount == rightSide.employeeCount)
            {
                return true;
            }
        }
        return false;
    }
}
