package com.xworkz.runtimepolymorphism.mobile;

public class Runner {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();
        phone.unlock();

        Mobile phone1 = new SmartPhone();
        phone1.unlock();

        Mobile phone2 = new Mobile();
        phone2.unlock();
    }
}
