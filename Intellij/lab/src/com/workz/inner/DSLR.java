package com.workz.inner;

public class DSLR implements  Camera{

    @Override
    public void capture() {
        System.out.println("Executing capture method in dslr class");
    }

    @Override
    public void deletePhoto() {
        System.out.println("executing delete photo in dslr class");
    }
}
