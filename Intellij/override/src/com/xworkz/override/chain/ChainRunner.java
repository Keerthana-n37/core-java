package com.xworkz.override.chain;

public class ChainRunner {

    public static void main(String[] args) {

        String[] designs = {"Gold Pattern", "Royal Engraving", "Luxury Cut"};

        Designer designer = new Designer("Armani", "Luxury House");

        Chain chain= new Chain("Royal Chain", 20, 50000.0, designs,
                ChainCategory.PARTY_WEAR, designer);

        SmartChain smartChain= new SmartChain("Diamond Chain", 22, 75000.0, designs,
                ChainCategory.ROYAL_COLLECTION, designer,
                true, "AI Embedded Design");

        chain.wear();
        chain.remove();
        System.out.println(chain);

        System.out.println("-------------------");

        smartChain.wear();
        smartChain.remove();
        smartChain.showTech();
        System.out.println(smartChain);
    }
}
