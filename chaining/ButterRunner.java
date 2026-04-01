class ButterRunner
{
    public static void main(String[] args)
    {
        System.out.println("Butter 1 details");
        DairyButter butter1 = new DairyButter("Creamy",200);
        butter1.display();

        System.out.println("Butter 2 details");
        DairyButter butter2 =new DairyButter("MilkyMist",65,"Unsalted","Classic",500);
        butter2.display();

        System.out.println("Butter 3 details");
        DairyButter butter3 =new DairyButter(55,"Salted","Garlic",250);
        butter3.display();
    }
}