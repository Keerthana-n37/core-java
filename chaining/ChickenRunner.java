class ChickenRunner
{
    public static void main(String[] args)
    {
        System.out.println("Chicken 1 details");
        FarmChicken chicken1 = new FarmChicken("White", 5);
        chicken1.display();

        System.out.println("Chicken 2 details");
        FarmChicken chicken2 =new FarmChicken("Organic", 3.2,"Kolar Farm","Brown", 7);
        chicken2.display();

        System.out.println("Chicken 3 details");
        FarmChicken chicken3 =new FarmChicken(2.8,"Local Farm","Black", 6);
        chicken3.display();
    }
}