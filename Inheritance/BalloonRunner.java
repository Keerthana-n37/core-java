class BalloonRunner 
{
    public static void main(String[] args) {

        System.out.println("Subclass Object Same Type");

        ColorBalloon balloon = new ColorBalloon();
        balloon.brand = "PartyTime";
        balloon.color = "Red";
        balloon.price = 50;
        balloon.pattern = "Dots";
        balloon.glowing = true;
        balloon.size = 12;
        balloon.material = "Rubber";
        balloon.heliumFilled = true;

        System.out.println("Brand : " + balloon.brand);
        System.out.println("Color : " + balloon.color);
        System.out.println("Price : " + balloon.price);
        System.out.println("Pattern : " + balloon.pattern);
        System.out.println("Glowing : " + balloon.glowing);
        System.out.println("Size : " + balloon.size);
        System.out.println("Material : " + balloon.material);
        System.out.println("Helium Filled : " + balloon.heliumFilled);
        balloon.inflate();
        balloon.burst();
        balloon.showDesign();


        System.out.println("Parent Reference Subclass Object");

        Balloon basicBalloon = new ColorBalloon();
        basicBalloon.brand = "SkyBalloon";
        basicBalloon.color = "Yellow";
        basicBalloon.price = 40;

        System.out.println("Brand : " + basicBalloon.brand);
        System.out.println("Color : " + basicBalloon.color);
        System.out.println("Price : " + basicBalloon.price);
        basicBalloon.inflate();
        basicBalloon.burst();


        System.out.println("Parent Class Object");

        Balloon normalBalloon = new Balloon();
        normalBalloon.brand = "LocalBrand";
        normalBalloon.color = "Green";
        normalBalloon.price = 20;

        System.out.println("Brand : " + normalBalloon.brand);
        System.out.println("Color : " + normalBalloon.color);
        System.out.println("Price : " + normalBalloon.price);
        normalBalloon.inflate();
        normalBalloon.burst();
    }