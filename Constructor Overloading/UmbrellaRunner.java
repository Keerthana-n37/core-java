class UmbrellaRunner
{
    public static void main(String[] args)
    {
        Umbrella umbrella1 = new Umbrella();
        System.out.println("----------------");

        Umbrella umbrella2 = new Umbrella("SkyBrolly");
        System.out.println("Umbrella brand: " + umbrella2.brand);
        System.out.println("----------------");

        Umbrella umbrella3 = new Umbrella("SkyBrolly", "Blue");
        System.out.println("Umbrella brand: " + umbrella3.brand);
        System.out.println("Umbrella color: " + umbrella3.color);
        System.out.println("----------------");

        Umbrella umbrella4 = new Umbrella("SkyBrolly", "Blue", 599.0);
        System.out.println("Umbrella brand: " + umbrella4.brand);
        System.out.println("Umbrella color: " + umbrella4.color);
        System.out.println("Umbrella price: " + umbrella4.price);
        System.out.println("----------------");

        Umbrella umbrella5 = new Umbrella("SkyBrolly", "Blue", 599.0, "Automatic");
        System.out.println("Umbrella brand: " + umbrella5.brand);
        System.out.println("Umbrella color: " + umbrella5.color);
        System.out.println("Umbrella price: " + umbrella5.price);
        System.out.println("Umbrella type: " + umbrella5.type);
        System.out.println("----------------");

        Umbrella umbrella6 = new Umbrella("SkyBrolly", "Blue", 599.0, "Automatic", 8);
        System.out.println("Umbrella brand: " + umbrella6.brand);
        System.out.println("Umbrella color: " + umbrella6.color);
        System.out.println("Umbrella price: " + umbrella6.price);
        System.out.println("Umbrella type: " + umbrella6.type);
        System.out.println("Umbrella ribs: " + umbrella6.ribs);
    }
}