package com.xworkz.override.chain;

import java.util.Arrays;

public class Chain {

    String chainName;
    int length;
    double price;
    String[] designs;
    ChainCategory category;
    Designer designer;

    Chain(String chainName, int length, double price, String[] designs,
          ChainCategory category, Designer designer) {

        this.chainName = chainName;
        this.length = length;
        this.price = price;
        this.designs = designs;
        this.category = category;
        this.designer = designer;
    }

    void wear() {
        System.out.println("Chain is worn");
    }

    void remove() {
        System.out.println("Chain is removed");
    }

    public String toString() {
        return "Chain{chainName='" + chainName + "', length=" + length + ", price=" + price + ", designs=" + Arrays.toString(designs) + ", category=" + category + ", designer=" + designer + "}";
    }
}
