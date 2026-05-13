package com.xworkz.runner;

import com.xworkz.inner.DmartSuperMarket;
import com.xworkz.inner.SuperMarket;
import com.xworkz.outer.RelianceSuperMarket;
import com.xworkz.usage.Producer;

public class SuperMarketRunner {

    public static void main(String[] args) {

        SuperMarket superMarket=new DmartSuperMarket();

        Producer producer=new Producer(superMarket);
        producer.sell();

        SuperMarket superMarket1=new RelianceSuperMarket();

        Producer producer1=new Producer(superMarket1);
        producer1.sell();
    }
}
