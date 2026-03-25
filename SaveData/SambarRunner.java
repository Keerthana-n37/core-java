class SambarRunner
{
    public static void main(String[] args)
    {
        Sambar[] sambarArray = new Sambar[10];
        SambarStore store = new SambarStore(sambarArray);

        Sambar sambar1 = new Sambar("Udupi Hotel", "Toor Dal", "Medium", 40, true, "Udupi");
        Sambar sambar2 = new Sambar("Darshini", "Toor Dal", "Spicy", 35, true, "Bangalore");
        Sambar sambar3 = new Sambar("South Cafe", "Masoor Dal", "Mild", 50, true, "Tamil");
        Sambar sambar4 = new Sambar("Annapurna", "Toor Dal", "Medium", 45, true, "Classic");
        Sambar sambar5 = new Sambar("Idli Corner", "Toor Dal", "Mild", 30, true, "Breakfast");
        Sambar sambar6 = new Sambar("Mysore Tiffin", "Toor Dal", "Spicy", 55, true, "Mysore");
        Sambar sambar7 = new Sambar("Sri Bhavan", "Moong Dal", "Medium", 38, true, "Home");
        Sambar sambar8 = new Sambar("Raghavendra", "Toor Dal", "Spicy", 42, true, "Karnataka");
        Sambar sambar9 = new Sambar("Food Spot", "Masoor Dal", "Medium", 36, false, "Simple");
        Sambar sambar10 = new Sambar("Sai Tiffins", "Toor Dal", "Mild", 34, true, "Local");

        store.save(sambar1);
        store.save(sambar2);
        store.save(sambar3);
        store.save(sambar4);
        store.save(sambar5);
        store.save(sambar6);
        store.save(sambar7);
        store.save(sambar8);
        store.save(sambar9);
        store.save(sambar10);
    }
}