package com.xworkz.usage;

import com.xworkz.inner.SuperMarket;

public class Producer {

    SuperMarket superMarket;

    public Producer(SuperMarket superMarket)
    {
        this.superMarket=superMarket;
    }

    public void sell()
    {
        System.out.println("Running sell method in Producer");
        if(this.superMarket!=null)
        {
            this.superMarket.discount();
            this.superMarket.purchase();
        }
    }
}
