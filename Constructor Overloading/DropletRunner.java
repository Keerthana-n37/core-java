class DropletRunner
{
    public static void main(String[] args)
    {
        Droplet droplet1 = new Droplet();
        System.out.println("----------------");

        Droplet droplet2 = new Droplet("Blue");
        System.out.println("Droplet color: " + droplet2.color);
        System.out.println("----------------");

        Droplet droplet3 = new Droplet("Blue", 2.5);
        System.out.println("Droplet color: " + droplet3.color);
        System.out.println("Droplet size: " + droplet3.size);
        System.out.println("----------------");

        Droplet droplet4 = new Droplet("Blue", 2.5, "Round");
        System.out.println("Droplet color: " + droplet4.color);
        System.out.println("Droplet size: " + droplet4.size);
        System.out.println("Droplet shape: " + droplet4.shape);
        System.out.println("----------------");

        Droplet droplet5 = new Droplet("Blue", 2.5, "Round", "Water");
        System.out.println("Droplet color: " + droplet5.color);
        System.out.println("Droplet size: " + droplet5.size);
        System.out.println("Droplet shape: " + droplet5.shape);
        System.out.println("Droplet type: " + droplet5.type);
        System.out.println("----------------");

        Droplet droplet6 = new Droplet("Blue", 2.5, "Round", "Water", 0.8);
        System.out.println("Droplet color: " + droplet6.color);
        System.out.println("Droplet size: " + droplet6.size);
        System.out.println("Droplet shape: " + droplet6.shape);
        System.out.println("Droplet type: " + droplet6.type);
        System.out.println("Droplet weight: " + droplet6.weight);
    }
}