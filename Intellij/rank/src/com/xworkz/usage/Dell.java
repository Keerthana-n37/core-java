package com.xworkz.usage;

import com.xworkz.inner.OS;

public class Dell {

    private OS os;

    public Dell(OS os)
    {
        this.os=os;
    }

    public void runSystem()
    {
        System.out.println("Running runSystem method in Dell");

        if(this.os!=null)
        {
            this.os.boot();
            System.out.println("Running boot method in runSystem");
        }
    }

    public void startSystem()
    {
        if(this.os!=null)
        {
            this.os.start();
            System.out.println("Running startSystem method in device");
        }
    }

    public void stopSystem()
    {
        if(this.os!=null)
        {
            this.os.stop();
            System.out.println("Running stopSystem method in device");
        }
    }
}
