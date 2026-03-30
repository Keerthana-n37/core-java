class ColorBalloon extends Balloon
{   
    String pattern;
    boolean glowing;
    int size;
    String material;
    boolean heliumFilled;

    ColorBalloon() 
	{
        super();
        System.out.println("ColorBalloon constructor...");
    }

    void showDesign()
	{
        System.out.println("Executing showDesign in ColorBalloon...");
    }
}