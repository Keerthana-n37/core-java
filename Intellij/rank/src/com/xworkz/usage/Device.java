package com.xworkz.usage;

import com.xworkz.inner.Bluetooth;

public class Device {

    private Bluetooth bluetooth;

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
    }

    public void disconnectDevice()
    {
        System.out.println("Running disconnectDevice in device");

        if(this.bluetooth!=null)
        {
            this.bluetooth.disConnect();
            System.out.println("Bluetooth is disconnected from the device");
        }

        else {
            System.out.println("Bluetooth cannot be disconnected");
        }
    }
}
