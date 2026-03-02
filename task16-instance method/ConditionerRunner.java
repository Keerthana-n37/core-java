class ConditionerRunner {

    public static void main(String[] args) {

        Conditioner conditioner1 = new Conditioner(1,"Dove","Intense Repair",299,340,
                "Dry",true,true,"Mild","White",5.5,"HUL","India",true,"Bottle","12/2026",
                "Keratin",false,4.5,"Daily");
        conditioner1.aboutConditioner();

        Conditioner conditioner2 = new Conditioner(2,"Pantene","Smooth & Silky",310,340,
                "Frizzy",true,false,"Pleasant","White",5.7,"P&G","India",true,"Bottle","11/2026",
                "Pro-V",false,4.4,"Daily");
        conditioner2.aboutConditioner();

        Conditioner conditioner3 = new Conditioner(3,"Loreal","Total Repair 5",450,360,
                "Damaged",true,true,"Floral","Golden",5.6,"Loreal","France",true,"Bottle","10/2026",
                "Ceramide",false,4.7,"Daily");
        conditioner3.aboutConditioner();

        Conditioner conditioner4 = new Conditioner(4,"Tresemme","Keratin Smooth",500,580,
                "Frizzy",true,true,"Salon","Black",5.5,"Unilever","India",true,"Bottle","09/2026",
                "Keratin",false,4.6,"Weekly");
        conditioner4.aboutConditioner();

        Conditioner conditioner5 = new Conditioner(5,"Mamaearth","Onion Conditioner",399,400,
                "Hair Fall",true,true,"Natural","Brown",5.4,"Mamaearth","India",true,"Pump","08/2026",
                "Onion Extract",true,4.3,"Daily");
        conditioner5.aboutConditioner();

        Conditioner conditioner6 = new Conditioner(6,"WOW","Apple Cider",499,500,
                "Oily",true,true,"Mild","Transparent",5.3,"WOW Skin","India",true,"Pump","07/2026",
                "Apple Cider",true,4.4,"Weekly");
        conditioner6.aboutConditioner();

        Conditioner conditioner7 = new Conditioner(7,"Himalaya","Protein Conditioner",280,340,
                "Normal",false,true,"Herbal","Green",5.9,"Himalaya","India",true,"Bottle","06/2026",
                "Chickpea",true,4.1,"Daily");
        conditioner7.aboutConditioner();

        Conditioner conditioner8 = new Conditioner(8,"Biotique","Bio Kelp",320,340,
                "Hair Fall",true,true,"Herbal","Dark Green",5.2,"Biotique","India",true,"Bottle","05/2026",
                "Kelp Extract",true,4.0,"Daily");
        conditioner8.aboutConditioner();

        Conditioner conditioner9 = new Conditioner(9,"Clinic Plus","Strong & Long",250,350,
                "Normal",false,false,"Floral","Blue",6.0, "HUL","India",true,"Bottle","04/2026",
                "Milk Protein",false,4.2,"Daily");
        conditioner9.aboutConditioner();

        Conditioner conditioner10 = new Conditioner(10,"Head & Shoulders","Smooth Care",330,340,
                "Oily",true,false,"Fresh","White",5.8,"P&G","India",true,"Bottle","03/2026",
                "Zinc",false,4.5,"Daily");
        conditioner10.aboutConditioner();
    }
}