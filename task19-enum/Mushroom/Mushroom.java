class Mushroom 
{
    int weightInGrams;         
    MushroomAttributes attributes; 
    MushroomType type;             

    Mushroom(int weightInGrams,MushroomAttributes attributes,MushroomType type) 
	{
        this.weightInGrams = weightInGrams;
        this.attributes = attributes;
        this.type = type;
    }

    void printInfo() 
	{
        System.out.println("Weight:"+this.weightInGrams);

        if(this.attributes != null)
		{
            this.attributes.showAttributes();
        }
		else {
            System.out.println("Mushroom attributes are null");
        }

        System.out.println("Mushroom Type:"+this.type);
        System.out.println("------------------------");
    }
}