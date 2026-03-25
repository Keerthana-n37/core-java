class FarmerRunner
{
    public static void main(String[] args)
    {
        Farmer[] farmers = new Farmer[10];
        FarmerStore store = new FarmerStore(farmers);

        Farmer farmer1 = new Farmer("Ramesh", 45, "Hesaraghatta", "Wheat", 5.0, true);
        Farmer farmer2 = new Farmer("Suresh", 50, "Doddaballapura", "Rice", 10.0, false);
        Farmer farmer3 = new Farmer("Anita", 38, "Nelamangala", "Sugarcane", 7.5, true);
        Farmer farmer4 = new Farmer("Kiran", 42, "Kanakapura", "Cotton", 8.0, false);
        Farmer farmer5 = new Farmer("Meena", 35, "Magadi", "Vegetables", 3.5, true);
        Farmer farmer6 = new Farmer("Rohit", 40, "Hoskote", "Fruits", 6.0, true);
        Farmer farmer7 = new Farmer("Divya", 32, "Ramanagara", "Rice", 4.0, false);
        Farmer farmer8 = new Farmer("Rahul", 48, "Devanahalli", "Wheat", 9.0, true);
        Farmer farmer9 = new Farmer("Neha", 36, "Channapatna", "Vegetables", 2.5, true);
        Farmer farmer10 = new Farmer("Ajay", 55, "Bidadi", "Sugarcane", 12.0, false);

        store.saveFarmer(farmer1);
        store.saveFarmer(farmer2);
        store.saveFarmer(farmer3);
        store.saveFarmer(farmer4);
        store.saveFarmer(farmer5);
        store.saveFarmer(farmer6);
        store.saveFarmer(farmer7);
        store.saveFarmer(farmer8);
        store.saveFarmer(farmer9);
        store.saveFarmer(farmer10);
    }
}