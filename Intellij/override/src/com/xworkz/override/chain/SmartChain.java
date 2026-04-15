package com.xworkz.override.chain;

public class SmartChain extends Chain{

    boolean isSmart;
    String technology;

    SmartChain(String chainName, int length, double price, String[] designs,
               ChainCategory category, Designer designer,
               boolean isSmart, String technology) {

        super(chainName, length, price, designs, category, designer);
        this.isSmart = isSmart;
        this.technology = technology;
    }

    void wear() {
        System.out.println("Smart Chain is worn");
    }

    void remove() {
        System.out.println("Smart Chain is removed");
    }

    void showTech() {
        System.out.println("Technology: " + technology);
    }

    public String toString() {
        return "SmartChain{isSmart=" + isSmart +
                ", technology='" + technology + "'} " + super.toString();
    }
}
