class ShaavarmaRunner
{
    public static void main(String[] args)
    {
        System.out.println("---- Shaavarma 1 ----");
        ChickenShaavarma shaavarma1 = new ChickenShaavarma("Garlic", true);
        shaavarma1.display();

        System.out.println("---- Shaavarma 2 ----");
        ChickenShaavarma shaavarma2 =new ChickenShaavarma("Empire Shawarma", "Large", 180, "Mayo", true);
        shaavarma2.display();

        System.out.println("---- Shaavarma 3 ----");
        ChickenShaavarma shaavarma3 =new ChickenShaavarma("Small", 100, "Spicy", false);
        shaavarma3.display();
    }
}