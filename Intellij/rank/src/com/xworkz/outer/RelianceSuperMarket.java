package com.xworkz.outer;

import com.xworkz.inner.SuperMarket;

public class RelianceSuperMarket implements SuperMarket {

    @Override
    public void purchase() {
        System.out.println("Running purchase method in RelianceSuperMarket");
    }

    @Override
    public void discount() {
        System.out.println("Running discount method in RelianceSuperMarket");
    }
}
