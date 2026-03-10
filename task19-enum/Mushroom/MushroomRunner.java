class MushroomRunner 
{
    public static void main(String[] args) 
	{
        MushroomAttributes attribute1 = new MushroomAttributes("White", "Fresh", "California");
        Mushroom mushroom1 = new Mushroom(200, attribute1, MushroomType.BUTTON);
        mushroom1.printInfo();

        MushroomAttributes attribute2 = new MushroomAttributes("Brown", "Refrigerated", "Oregon");
        Mushroom mushroom2 = new Mushroom(150, attribute2, MushroomType.SHIITAKE);
        mushroom2.printInfo();

        MushroomAttributes attribute3 = new MushroomAttributes("Cream", "Fresh", "Texas");
		MushroomType type = MushroomType.OYSTER;
        Mushroom mushroom3 = new Mushroom(250, attribute3,type);
        mushroom3.printInfo();

        MushroomAttributes attribute4 = new MushroomAttributes("Dark Brown", "Not Fresh", "Arizona");
		MushroomType type1 = MushroomType.PORTOBELLO;
        Mushroom mushroom4 = new Mushroom(300, attribute4,type1);
        mushroom4.printInfo();
    }
}