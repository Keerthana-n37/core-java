package com.xworkz.inner;

public class RealmeBluetooth implements Bluetooth{

    public void connect() {
        System.out.println("Executing connect method in RealmeBluetooth");
    }

    @Override
    public void disConnect() {
        System.out.println("Executing disConnect method in RealmeBluetooth");
    }
}
