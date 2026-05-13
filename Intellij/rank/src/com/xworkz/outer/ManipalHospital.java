package com.xworkz.outer;

import com.xworkz.inner.Hospital;

public class ManipalHospital implements Hospital {

    @Override
    public void treatment() {
        System.out.println("Executing treatment method in ManipalHospital");
    }
}
