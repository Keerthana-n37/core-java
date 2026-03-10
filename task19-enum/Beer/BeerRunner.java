class BeerRunner 
{

    public static void main(String[] args) 
	{

        QualityCheck quality1 = new QualityCheck("B101","12-12-2026","Passed");
        Beer beer1 = new Beer(330, quality1, BeerFlavor.BITTER);
        beer1.printInfo();

        QualityCheck quality2 = new QualityCheck("B102","05-10-2026","Passed");
        Beer beer2 = new Beer(500, quality2, BeerFlavor.SWEET);
        beer2.printInfo();

        QualityCheck quality3 = new QualityCheck("B103","01-08-2026","Pending");
		BeerFlavor flavor= BeerFlavor.SOUR;
        Beer beer3 = new Beer(250, quality3,flavor);
        beer3.printInfo();

        QualityCheck quality4 = new QualityCheck("B104","22-11-2026","Passed");
		BeerFlavor flavor1= BeerFlavor.MALTY;
        Beer beer4 = new Beer(650, quality4,flavor1);
        beer4.printInfo();
    }
}