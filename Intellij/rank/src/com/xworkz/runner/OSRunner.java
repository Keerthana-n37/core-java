package com.xworkz.runner;

import com.xworkz.inner.OS;
import com.xworkz.inner.WindowsOS;
import com.xworkz.outer.LinuxOS;
import com.xworkz.usage.Dell;

public class OSRunner {

    public static void main(String[] args) {

        OS os=new WindowsOS();

        Dell dell=new Dell(os);
        dell.runSystem();
        dell.startSystem();
        dell.stopSystem();

        OS os1= new LinuxOS();

        Dell dell1= new Dell(os1);
        dell1.runSystem();
        dell1.stopSystem();
        dell1.startSystem();
    }
}
