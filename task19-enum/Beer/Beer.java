class Beer 
{
    int volumeInMl;
    QualityCheck quality;
    BeerFlavor flavor;

    Beer(int volumeInMl, QualityCheck quality, BeerFlavor flavor)
	{
        this.volumeInMl = volumeInMl;
        this.quality = quality;
        this.flavor = flavor;
    }

    void printInfo()
	{
        System.out.println("Volume:" +this.volumeInMl);
		
        if(this.quality!= null) {
            this.quality.showQuality();
        } 
        else {
            System.out.println("Quality details not available");
        }

        System.out.println("Flavor:" +this.flavor);
        System.out.println("--------------------------");
    }
}