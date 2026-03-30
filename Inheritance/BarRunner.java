class BarRunner 
{
    public static void main(String[] args) 
	{

        CocktailBar cocktailBar = new CocktailBar();
        cocktailBar.name = "Sky Lounge";
        cocktailBar.location = "Downtown";
        cocktailBar.capacity = 100;
        cocktailBar.open24Hours = false;
        cocktailBar.cocktailMenu = "Exotic Cocktails";
        cocktailBar.liveMusic = true;
        cocktailBar.numberOfStaff = 15;
        cocktailBar.happyHour = true;
        cocktailBar.signatureCocktail = "Sunset Breeze";

        System.out.println("Name: " + cocktailBar.name);
        System.out.println("Location: " + cocktailBar.location);
        System.out.println("Capacity: " + cocktailBar.capacity);
        System.out.println("Open 24 Hours: " + cocktailBar.open24Hours);
        System.out.println("Cocktail Menu: " + cocktailBar.cocktailMenu);
        System.out.println("Live Music: " + cocktailBar.liveMusic);
        System.out.println("Number of Staff: " + cocktailBar.numberOfStaff);
        System.out.println("Happy Hour: " + cocktailBar.happyHour);
        System.out.println("Signature Cocktail: " + cocktailBar.signatureCocktail);

        cocktailBar.serveDrinks();
        cocktailBar.closeBar();
        cocktailBar.playMusic();
        cocktailBar.mixCocktail();

        Bar basicBar = new CocktailBar();
        basicBar.name = "Moonlight Bar";
        basicBar.location = "Beachside";
        basicBar.capacity = 80;
        basicBar.open24Hours = true;

        System.out.println("Name: " + basicBar.name);
        System.out.println("Location: " + basicBar.location);
        System.out.println("Capacity: " + basicBar.capacity);
        System.out.println("Open 24 Hours: " + basicBar.open24Hours);

        basicBar.serveDrinks();
        basicBar.closeBar();

        Bar normalBar = new Bar();
        normalBar.name = "Local Pub";
        normalBar.location = "City Center";
        normalBar.capacity = 50;
        normalBar.open24Hours = false;

        System.out.println("Name: " + normalBar.name);
        System.out.println("Location: " + normalBar.location);
        System.out.println("Capacity: " + normalBar.capacity);
        System.out.println("Open 24 Hours: " + normalBar.open24Hours);

        normalBar.serveDrinks();
        normalBar.closeBar();
    }
}