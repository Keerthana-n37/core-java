package com.xworkz.override.stitch;

public class SmartStitchMachine  extends Stitch{

    boolean autoCut;
    String designMode;

    SmartStitchMachine(String machineName, int speed, String[] threads,
                       MachineLevel level, Tailor tailor,
                       boolean autoCut, String designMode) {

        super(machineName, speed, threads, level, tailor);
        this.autoCut = autoCut;
        this.designMode = designMode;
    }

    void start() {

        System.out.println("Smart Stitch Machine started");
    }

    void stop() {

        System.out.println("Smart Stitch Machine stopped");
    }

    void showDesign() {
        System.out.println("Design Mode: " + designMode);
    }

    public String toString() {
        return "SmartStitchMachine{autoCut=" + autoCut + ", designMode='" + designMode + "'} " + super.toString();
    }
}

