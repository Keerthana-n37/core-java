package com.xworkz.usage;

import com.xworkz.inner.OS;

public class Dell {

    OS os;

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
            this.os.start();
            this.os.stop();
        }
    }
}
