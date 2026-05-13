package com.xworkz.outer;

import com.xworkz.inner.OS;

public class LinuxOS implements OS {

    @Override
    public void boot() {
        System.out.println("Running boot method in LinuxOS");
    }

    @Override
    public void start() {
        System.out.println("Running start method in LinuxOS");
    }

    @Override
    public void stop() {
        System.out.println("running stop method in LinuxOS");
    }
}
