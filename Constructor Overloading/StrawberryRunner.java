class StrawberryRunner
{
    public static void main(String[] args)
    {
        Strawberry strawberry1 = new Strawberry();
        System.out.println("----------------");

        Strawberry strawberry2 = new Strawberry("Red", 50.0);
        System.out.println("Strawberry color: " + strawberry2.color);
        System.out.println("Strawberry price: " + strawberry2.price);
        System.out.println("----------------");

        Strawberry strawberry3 = new Strawberry(25.0, "Sweet");
        System.out.println("Strawberry weight: " + strawberry3.weight);
        System.out.println("Strawberry taste: " + strawberry3.taste);
        System.out.println("----------------");

        Strawberry strawberry4 = new Strawberry("California", "Red");
        System.out.println("Strawberry origin: " + strawberry4.origin);
        System.out.println("Strawberry color: " + strawberry4.color);
        System.out.println("----------------");

        Strawberry strawberry5 = new Strawberry("Red", "Sweet", 30.0);
        System.out.println("Strawberry color: " + strawberry5.color);
        System.out.println("Strawberry taste: " + strawberry5.taste);
        System.out.println("Strawberry weight: " + strawberry5.weight);
        System.out.println("----------------");

        Strawberry strawberry6 = new Strawberry("Red", 35.0, "Sweet", "California", 60.0);
        System.out.println("Strawberry color: " + strawberry6.color);
        System.out.println("Strawberry weight: " + strawberry6.weight);
        System.out.println("Strawberry taste: " + strawberry6.taste);
        System.out.println("Strawberry origin: " + strawberry6.origin);
        System.out.println("Strawberry price: " + strawberry6.price);
    }
}