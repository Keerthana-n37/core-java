package com.xworkz.runner;

import com.xworkz.inner.ApolloHospital;
import com.xworkz.inner.Hospital;
import com.xworkz.usage.Doctor;

public class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospital=new ApolloHospital();

        Doctor doctor=new Doctor(hospital);

        doctor.checkPatient();
    }
}
