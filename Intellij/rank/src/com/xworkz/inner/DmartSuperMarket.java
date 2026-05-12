package com.xworkz.inner;

public class DmartSuperMarket implements SuperMarket{

    @Override
    public void purchase() {
        System.out.println("Executing purchase method in DmartSupermarket");
    }

    @Override
    public void discount() {
        System.out.println("Running discount method in dmartSuperMarket");
    }
}
