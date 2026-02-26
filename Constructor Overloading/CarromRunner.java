class CarromRunner
{
    public static void main(String[] args)
    {
        Carrom carrom1 = new Carrom();
        System.out.println("-------------------------");

        Carrom carrom2 = new Carrom("Synco", 19);
        System.out.println("Brand: " + carrom2.brand);
        System.out.println("Coins: " + carrom2.coins);
        System.out.println("-------------------------");

        Carrom carrom3 = new Carrom(29.0, 4500.0);
        System.out.println("Size: " + carrom3.size);
        System.out.println("Price: " + carrom3.price);
        System.out.println("-------------------------");

        Carrom carrom4 = new Carrom("Wood", "Precise");
        System.out.println("Material: " + carrom4.material);
        System.out.println("Brand: " + carrom4.brand);
        System.out.println("-------------------------");

        Carrom carrom5 = new Carrom("Synco", 30.0);
        System.out.println("Brand: " + carrom5.brand);
        System.out.println("Size: " + carrom5.size);
        System.out.println("-------------------------");

        Carrom carrom6 = new Carrom("Synco","Wood",30.0,19,5000.0);
        System.out.println("Brand: " + carrom6.brand);
        System.out.println("Material: " + carrom6.material);
        System.out.println("Size: " + carrom6.size);
        System.out.println("Coins: " + carrom6.coins);
        System.out.println("Price: " + carrom6.price);
        System.out.println("-------------------------");
    }
}