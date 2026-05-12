package com.xworkz.usage;

import com.xworkz.inner.Bluetooth;

public class Device {

    Bluetooth bluetooth;

    public void setBluetooth(Bluetooth bluetooth)
    {
        this.bluetooth=bluetooth;
    }

    public void useDevice()
    {
        System.out.println("Running useDevice method in Device");

        if(this.bluetooth!=null)
        {
            this.bluetooth.connect();
            System.out.println("Bluetooth is connected");
        }
        else {
            System.out.println("Bluetooth cannot be connected");
        }

        if(this.bluetooth!=null)
        {
            this.bluetooth.disConnect();
            System.out.println("Bluetooth is disconnected");
        }
        else {
            System.out.println("Bluetooth cannot be disconnected");
        }
    }
}
