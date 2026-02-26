class HairDryerRunner
{
    public static void main(String[] args)
    {
        HairDryer dryer1 = new HairDryer();
        System.out.println("----------------");

        HairDryer dryer2 = new HairDryer("Philips", 1999.0);
        System.out.println("HairDryer brand: " + dryer2.brand);
        System.out.println("HairDryer price: " + dryer2.price);
        System.out.println("----------------");

        HairDryer dryer3 = new HairDryer(1200, 3);
        System.out.println("HairDryer watt: " + dryer3.watt);
        System.out.println("HairDryer speed levels: " + dryer3.speedlevels);
        System.out.println("----------------");

        HairDryer dryer4 = new HairDryer("Philips", "Black", 1800);
        System.out.println("HairDryer brand: " + dryer4.brand);
        System.out.println("HairDryer color: " + dryer4.color);
        System.out.println("HairDryer watt: " + dryer4.watt);
        System.out.println("----------------");

        HairDryer dryer5 = new HairDryer("White", 2, 2499.0);
        System.out.println("HairDryer color: " + dryer5.color);
        System.out.println("HairDryer speed levels: " + dryer5.speedlevels);
        System.out.println("HairDryer price: " + dryer5.price);
        System.out.println("----------------");

        HairDryer dryer6 = new HairDryer("Philips", 2000, "Black", 2999.0, 4);
        System.out.println("HairDryer brand: " + dryer6.brand);
        System.out.println("HairDryer watt: " + dryer6.watt);
        System.out.println("HairDryer color: " + dryer6.color);
        System.out.println("HairDryer price: " + dryer6.price);
        System.out.println("HairDryer speed levels: " + dryer6.speedlevels);
    }
}