package com.workz.inner;

public class MVJCollege implements College{

    @Override
    public void exam() {
        System.out.println("Executing exam method in MVJ college");
    }

    @Override
    public void results() {
        System.out.println("executing results method in MVJ college");
    }
}
