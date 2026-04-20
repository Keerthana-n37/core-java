package com.xworkz.tostringandequals.sim;

public class Sim {

    String networkName;
    long number;
    boolean isActive;

    public Sim(String networkName, long number, boolean isActive)
    {
        this.networkName = networkName;
        this.number = number;
        this.isActive = isActive;
    }

    public String toString()
    {
        return "Network: " + networkName + ", Number: " + number + ", Active: " + isActive;
    }

    public boolean equals(Object obj)
    {
        Sim leftSide = this;

        if(obj instanceof Sim)
        {
            Sim rightSide = (Sim)obj;

            if(leftSide.networkName.equals(rightSide.networkName) &&
                    leftSide.number == rightSide.number &&
                    leftSide.isActive == rightSide.isActive)
            {
                return true;
            }
        }
        return false;
    }
}
