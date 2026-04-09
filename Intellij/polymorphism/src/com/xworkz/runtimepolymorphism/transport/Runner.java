package com.xworkz.runtimepolymorphism.transport;

public class Runner {
    public static void main(String[] args) {
        Transport transport= new Transport();
        transport.travel();

        Transport transport1 = new TrainTransport();
        transport1.travel();

        Transport transport2= new BusTransport();
        transport2.travel();
    }
}
