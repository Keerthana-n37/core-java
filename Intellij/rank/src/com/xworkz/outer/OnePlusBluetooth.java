package com.xworkz.outer;

import com.xworkz.inner.Bluetooth;

public class OnePlusBluetooth implements Bluetooth {

    @Override
    public void connect() {
        System.out.println("Connect method is used by OnePlus bluetooth to connect with device");
    }

    @Override
    public void disConnect() {
        System.out.println("Disconnect method is used by OnePlusBluetooth");
    }
}
