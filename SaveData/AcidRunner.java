class AcidRunner
{
    public static void main(String[] args)
    {
        Acid[] acids = new Acid[10];
        AcidStore store = new AcidStore(acids);

        Acid acid1 = new Acid("Hydrochloric Acid", "HCl", 1, "Cleaning metals", true, "Colorless");
        Acid acid2 = new Acid("Sulfuric Acid", "H2SO4", 1, "Battery acid", true, "Colorless");
        Acid acid3 = new Acid("Nitric Acid", "HNO3", 1, "Fertilizer production", true, "Colorless");
        Acid acid4 = new Acid("Acetic Acid", "CH3COOH", 3, "Vinegar making", false, "Colorless");
        Acid acid5 = new Acid("Citric Acid", "C6H8O7", 3, "Food preservative", false, "White");
        Acid acid6 = new Acid("Carbonic Acid", "H2CO3", 4, "Soft drinks", false, "Colorless");
        Acid acid7 = new Acid("Phosphoric Acid", "H3PO4", 2, "Fertilizers", false, "Colorless");
        Acid acid8 = new Acid("Lactic Acid", "C3H6O3", 3, "Dairy products", false, "Colorless");
        Acid acid9 = new Acid("Tartaric Acid", "C4H6O6", 3, "Baking powder", false, "White");
        Acid acid10 = new Acid("Formic Acid", "CH2O2", 2, "Leather processing", false, "Colorless");

        store.saveAcid(acid1);
        store.saveAcid(acid2);
        store.saveAcid(acid3);
        store.saveAcid(acid4);
        store.saveAcid(acid5);
        store.saveAcid(acid6);
        store.saveAcid(acid7);
        store.saveAcid(acid8);
        store.saveAcid(acid9);
        store.saveAcid(acid10);
    }
}