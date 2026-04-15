package com.xworkz.override.stitch;

import java.util.Arrays;

public class Stitch {

    String machineName;
    int speed;
    String[] threads;
    MachineLevel level;
    Tailor tailor;

    Stitch(String machineName, int speed, String[] threads, MachineLevel level, Tailor tailor) {
        this.machineName = machineName;
        this.speed = speed;
        this.threads = threads;
        this.level = level;
        this.tailor = tailor;
    }

    void start() {
        System.out.println("Stitching started");
    }

    void stop() {
        System.out.println("Stitching stopped");
    }

    public String toString() {
        return "Stitch{machineName='" + machineName + "', speed=" + speed + ", threads=" + Arrays.toString(threads) + ", level=" + level + ", tailor=" + tailor + "}";
    }
}
