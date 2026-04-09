package com.xworkz.runtimepolymorphism.transport;

public class TrainTransport extends Transport{

    @Override
    public void travel() {
        System.out.println("Travel on tracks");
    }
}
