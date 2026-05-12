package com.xworkz.inner;

public class WindowsOS implements OS{

    @Override
    public void boot() {
        System.out.println("Running boot method in WindowsOS");
    }

    @Override
    public void start() {
        System.out.println("Running start method in WindowsOS");
    }

    @Override
    public void stop() {
        System.out.println("Executing stop method in WindowsOS");
    }
}
