package com.xworkz.runner;

import com.xworkz.inner.Bluetooth;
import com.xworkz.inner.RealmeBluetooth;
import com.xworkz.outer.OnePlusBluetooth;
import com.xworkz.usage.Device;

public class BluetoothRunner {

    public static void main(String[] args) {

        Bluetooth bluetooth = new RealmeBluetooth();

        Device device = new Device();

        device.setBluetooth(bluetooth);

        device.useDevice();

        device.disconnectDevice();

        Bluetooth bluetooth1= new OnePlusBluetooth();

        device.setBluetooth(bluetooth1);
        device.useDevice();
        device.disconnectDevice();
    }
}
