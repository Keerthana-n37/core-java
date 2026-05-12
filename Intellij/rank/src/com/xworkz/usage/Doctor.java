package com.xworkz.usage;

import com.xworkz.inner.Hospital;

public class Doctor {

    Hospital hospital;

    public Doctor(Hospital hospital)
    {
        this.hospital=hospital;
    }

    public void checkPatient()
    {
        System.out.println("Running checkPatient method in Doctor");

        if(this.hospital!=null)
        {
            this.hospital.treatment();
        }
    }
}
