package com.xworkz.runtimepolymorphism.tansportation;

public class Runner {

    public static void main(String[] args) {

        GoodsTransportation transportation = new GoodsTransportation();
        transportation.Transport();

        Transportation transportation1= new Transportation();
        transportation1.Transport();

    }
}
