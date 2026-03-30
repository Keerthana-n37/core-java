class OpenerRunner 
{
    public static void main(String[] args) 
	{

        BottleOpener bottleOpener = new BottleOpener();
        bottleOpener.brand = "FlipEase";
        bottleOpener.material = "Stainless Steel";
        bottleOpener.isManual = true;
        bottleOpener.length = 15.5;
        bottleOpener.hasCorkScrew = true;
        bottleOpener.color = "Red";
        bottleOpener.warranty = 24;
        bottleOpener.portable = true;
        bottleOpener.handleType = "Ergonomic";

        System.out.println("Brand: " + bottleOpener.brand);
        System.out.println("Material: " + bottleOpener.material);
        System.out.println("Is Manual: " + bottleOpener.isManual);
        System.out.println("Length: " + bottleOpener.length + " cm");
        System.out.println("Has CorkScrew: " + bottleOpener.hasCorkScrew);
        System.out.println("Color: " + bottleOpener.color);
        System.out.println("Warranty: " + bottleOpener.warranty + " months");
        System.out.println("Portable: " + bottleOpener.portable);
        System.out.println("Handle Type: " + bottleOpener.handleType);

        bottleOpener.open();
        bottleOpener.clean();
        bottleOpener.twistCap();
        bottleOpener.sharpenEdge();

        Opener basicOpener = new BottleOpener();
        basicOpener.brand = "EasyPop";
        basicOpener.material = "Aluminum";
        basicOpener.isManual = false;
        basicOpener.length = 12.0;

        System.out.println("Brand: " + basicOpener.brand);
        System.out.println("Material: " + basicOpener.material);
        System.out.println("Is Manual: " + basicOpener.isManual);
        System.out.println("Length: " + basicOpener.length + " cm");

        basicOpener.open();
        basicOpener.clean();

        Opener normalOpener = new Opener();
        normalOpener.brand = "HomeBasic";
        normalOpener.material = "Plastic";
        normalOpener.isManual = true;
        normalOpener.length = 10.0;

        System.out.println("Brand: " + normalOpener.brand);
        System.out.println("Material: " + normalOpener.material);
        System.out.println("Is Manual: " + normalOpener.isManual);
        System.out.println("Length: " + normalOpener.length + " cm");

        normalOpener.open();
        normalOpener.clean();
    }
}