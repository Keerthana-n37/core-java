package com.xworkz.override.stitch;

public class StitchRunner {

    public static void main(String[] args) {

        String[] threads = {"Cotton", "Silk", "Nylon"};

        Tailor tailor = new Tailor("Ravi", 5);

        Stitch stitch = new Stitch("Singer", 1200, threads, MachineLevel.BASIC, tailor);

        SmartStitchMachine smartStitchMachine = new SmartStitchMachine("Juki", 2000, threads, MachineLevel.ADVANCED, tailor, true, "Fashion Mode");

        stitch.start();
        stitch.stop();
        System.out.println(stitch);

        System.out.println("-------------------");

        smartStitchMachine.start();
        smartStitchMachine.stop();
        smartStitchMachine.showDesign();
        System.out.println(smartStitchMachine);
    }
}
