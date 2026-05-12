package com.xworkz.runner;

import com.xworkz.inner.OS;
import com.xworkz.inner.WindowsOS;
import com.xworkz.usage.Dell;

public class OSRunner {

    public static void main(String[] args) {

        OS os=new WindowsOS();

        Dell dell=new Dell(os);

        dell.runSystem();
    }
}
