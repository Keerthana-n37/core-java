class LotionRunner {

    public static void main(String[] args) {

        Lotion lotion1 = new Lotion(1,"Vaseline","Cocoa Glow",299,400,
                "Dry",true,false,"Cocoa","Light Brown",5.5,
                "HUL","India",true,"Bottle","12/2026",
                "Cocoa Butter",false,4.5,"Daily");
        lotion1.aboutLotion();

        Lotion lotion2 = new Lotion(2,"Nivea","Body Milk",325,400,
                "Very Dry",true,false,"Mild","White",5.8,
                "Nivea","Germany",true,"Bottle","11/2026",
                "Almond Oil",false,4.6,"Daily");
        lotion2.aboutLotion();

        Lotion lotion3 = new Lotion(3,"Himalaya","Herbal Moisturizer",250,200,
                "Normal",true,false,"Herbal","White",6.0,
                "Himalaya","India",true,"Tube","10/2026",
                "Aloe Vera",true,4.2,"Daily");
        lotion3.aboutLotion();

        Lotion lotion4 = new Lotion(4,"Cetaphil","Moisturizing Lotion",550,250,
                "Sensitive",true,true,"None","White",5.6,
                "Galderma","USA",true,"Pump","09/2026",
                "Glycerin",false,4.7,"Daily");
        lotion4.aboutLotion();

        Lotion lotion5 = new Lotion(5,"Ponds","Light Moisturizer",199,150,
                "Oily",true,false,"Fresh","White",5.9,
                "HUL","India",true,"Bottle","08/2026",
                "Vitamin E",false,4.1,"Daily");
        lotion5.aboutLotion();

        Lotion lotion6 = new Lotion(6,"Mamaearth","Ubtan Lotion",349,300,
                "All Skin",true,false,"Natural","Cream",5.4,
                "Mamaearth","India",true,"Pump","07/2026",
                "Turmeric",true,4.3,"Daily");
        lotion6.aboutLotion();

        Lotion lotion7 = new Lotion(7,"WOW","Coconut Lotion",399,300,
                "Dry",true,false,"Coconut","White",5.3,
                "WOW Skin","India",true,"Pump","06/2026",
                "Coconut Oil",true,4.4,"Daily");
        lotion7.aboutLotion();

        Lotion lotion8 = new Lotion(8,"Dove","Nourishing Lotion",320,350,
                "Normal",true,false,"Mild","White",5.7,
                "HUL","India",true,"Bottle","05/2026",
                "Shea Butter",false,4.5,"Daily");
        lotion8.aboutLotion();

        Lotion lotion9 = new Lotion(9,"Biotique","Morning Nectar",280,190,
                "All Skin",true,false,"Herbal","Light Yellow",5.2,
                "Biotique","India",true,"Bottle","04/2026",
                "Honey",true,4.0,"Daily");
        lotion9.aboutLotion();

        Lotion lotion10 = new Lotion(10,"Lakme","Peach Milk",260,200,
                "Normal",true,false,"Peach","Peach",5.6,
                "Lakme","India",true,"Bottle","03/2026",
                "Peach Extract",false,4.2,"Daily");
        lotion10.aboutLotion();
    }
}