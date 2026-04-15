package com.xworkz.override.dollar;

import java.util.Arrays;

public class Dollar {

    String symbol;
    String material;
    String[] engravings;
    DollarMaterial dollarMaterial;
    Designer designer;

    Dollar(String symbol, String material, String[] engravings,
           DollarMaterial dollarMaterial, Designer designer) {

        this.symbol = symbol;
        this.material = material;
        this.engravings = engravings;
        this.material = material;
        this.designer = designer;
    }

    void shine() {
        System.out.println("Dollar ornament is shining");
    }

    void polish() {
        System.out.println("Dollar ornament is being polished");
    }

    public String toString() {
        return "Dollar{symbol='" + symbol + "', material='" + material + "', engravings=" + Arrays.toString(engravings) + ", dollarMaterial=" + dollarMaterial + ", designer=" + designer + "}";
    }
}
