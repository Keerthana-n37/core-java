package com.xworkz.usage;

import com.xworkz.inner.Remote;

public class User {

    Remote remote;

    public void setRemote(Remote remote)
    {
        this.remote=remote;
    }

    public void operate()
    {
        System.out.println("Running operate method in User");

        if(this.remote!=null)
        {
            this.remote.turnOn();
            System.out.println("Turning on the remote in user class");
        }else{
            System.out.println("Remote cannot be turned on");
        }
        if(this.remote!=null)
        {
            this.remote.turnOff();
            System.out.println("Turning off the remote in user class");
        }
        else {
            System.out.println("Remote cannot be turned off");
        }
    }
}
