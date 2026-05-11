package com.workz.inner;

public class SmartPhoneRunner {
    public static void main(String[] args) {

        SmartPhone smartPhone = new OnePlusPhone();

        smartPhone.call();
        smartPhone.browse();
        smartPhone.charge();
        smartPhone.playMusic();
        SmartPhone.phoneInfo();
    }
}
