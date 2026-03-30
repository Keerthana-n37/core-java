class CocktailBar extends Bar 
{
    String cocktailMenu;
    boolean liveMusic;
    int numberOfStaff;
    boolean happyHour;
    String signatureCocktail;

    CocktailBar() 
	{
        super();
        System.out.println("CocktailBar constructor called...");
    }

    void playMusic() 
	{
        System.out.println("Playing music at " + name);
    }

    void mixCocktail() 
	{
        System.out.println("Mixing " + signatureCocktail);
    }
}