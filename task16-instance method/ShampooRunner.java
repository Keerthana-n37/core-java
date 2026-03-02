class ShampooRunner {

    public static void main(String[] args) {

        Shampoo shampoo1 = new Shampoo(1,"Dove","Hair Fall Rescue",299,340,
                "Dry",false,true,"Mild","White",5.5, "HUL","India",true,"Bottle","12/2026",
                "Keratin",false,4.5,"Daily");
        shampoo1.aboutShampoo();

        Shampoo shampoo2 = new Shampoo(2,"Clinic Plus","Strong & Long",250,350,
                "Normal",false,false,"Floral","Blue",6.0, "HUL","India",true,"Bottle","10/2026",
                "Milk Protein",false,4.2,"Daily");
        shampoo2.aboutShampoo();

        Shampoo shampoo3 = new Shampoo(3,"Head & Shoulders","Anti Dandruff",320,340,
                "Oily",true,false,"Fresh","White",5.8, "P&G","India",true,"Bottle","11/2026",
                "Zinc",false,4.6,"Daily");
        shampoo3.aboutShampoo();

        Shampoo shampoo4 = new Shampoo(4,"Pantene","Smooth & Silky",310,340,
                "Dry",false,false,"Mild","White",5.7,"P&G","India",true,"Bottle","09/2026",
                "Pro-V",false,4.4,"Daily");
        shampoo4.aboutShampoo();

        Shampoo shampoo5 = new Shampoo(5,"Loreal","Total Repair 5",450,360,
                "Damaged",false,true,"Pleasant","Golden",5.6, "Loreal","France",true,"Bottle","08/2026",
                "Ceramide",false,4.7,"Daily");
        shampoo5.aboutShampoo();

        Shampoo shampoo6 = new Shampoo(6,"Tresemme","Keratin Smooth",500,580,
                "Frizzy",false,true,"Salon","Black",5.5,"Unilever","India",true,"Bottle","07/2026",
                "Keratin",false,4.5,"Weekly");
        shampoo6.aboutShampoo();

        Shampoo shampoo7 = new Shampoo(7,"Mamaearth","Onion Shampoo",399,400,
                "Hair Fall",true,true,"Natural","Brown",5.4,"Mamaearth","India",true,"Pump","06/2026",
                "Onion Extract",true,4.3,"Daily");
        shampoo7.aboutShampoo();

        Shampoo shampoo8 = new Shampoo(8,"WOW","Apple Cider Vinegar",499,500,
                "Oily",true,true,"Mild","Transparent",5.3,"WOW Skin","India",true,"Pump","05/2026",
                "Apple Cider",true,4.4,"Weekly");
        shampoo8.aboutShampoo();

        Shampoo shampoo9 = new Shampoo(9,"Himalaya","Protein Shampoo",280,340,
                "Normal",false,true,"Herbal","Green",5.9,"Himalaya","India",true,"Bottle","04/2026",
                "Chickpea",true,4.1,"Daily");
        shampoo9.aboutShampoo();

        Shampoo shampoo10 = new Shampoo(10,"Biotique","Bio Kelp",320,340,
                "Hair Fall",true,true,"Herbal","Dark Green",5.2,"Biotique","India",true,"Bottle","03/2026",
                "Kelp Extract",true,4.0,"Daily");
        shampoo10.aboutShampoo();
    }
}