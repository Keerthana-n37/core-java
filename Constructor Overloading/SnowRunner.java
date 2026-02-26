class SnowRunner
{
    public static void main(String[] args)
    {
        Snow snow1 = new Snow();
        System.out.println("----------------");

        Snow snow2 = new Snow("Powder", "Himalayas");
        System.out.println("Snow type: " + snow2.type);
        System.out.println("Snow region: " + snow2.region);
        System.out.println("----------------");

        Snow snow3 = new Snow(-5.5, 20);
        System.out.println("Snow temperature: " + snow3.temperature);
        System.out.println("Snow thickness: " + snow3.thickness);
        System.out.println("----------------");

        Snow snow4 = new Snow("White", "Soft", -3.0);
        System.out.println("Snow color: " + snow4.color);
        System.out.println("Snow type: " + snow4.type);
        System.out.println("Snow temperature: " + snow4.temperature);
        System.out.println("----------------");

        Snow snow5 = new Snow("Hard", "Alps", 30);
        System.out.println("Snow type: " + snow5.type);
        System.out.println("Snow region: " + snow5.region);
        System.out.println("Snow thickness: " + snow5.thickness);
        System.out.println("----------------");

        Snow snow6 = new Snow("Powder", -10.0, "Kashmir", "White", 40);
        System.out.println("Snow type: " + snow6.type);
        System.out.println("Snow temperature: " + snow6.temperature);
        System.out.println("Snow region: " + snow6.region);
        System.out.println("Snow color: " + snow6.color);
        System.out.println("Snow thickness: " + snow6.thickness);
    }
}