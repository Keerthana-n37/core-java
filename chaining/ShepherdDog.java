class ShepherdDog extends GermanShepherd 
{
    String furColor;
    boolean isTrained;

    ShepherdDog(String furColor, boolean isTrained) 
	{
        super("Rex", 14, 29.5);
        this.furColor = furColor;
        this.isTrained = isTrained;
        System.out.println("Constructor 1: Default shepherd created");
    }

    ShepherdDog(String dogName,double dogWeight,int dogAge,String furColor,boolean isTrained)
	{
        super(dogName, dogAge, dogWeight);
        this.furColor = furColor;
        this.isTrained = isTrained;
        System.out.println("Constructor 2: Complete shepherd details");
    }

    ShepherdDog(int dogAge,String furColor,boolean isTrained, double dogWeight) 
	{
        super("Buddy", dogAge, dogWeight);
        this.furColor = furColor;
        this.isTrained = isTrained;
        System.out.println("Constructor 3: Custom age and weight");
    }

    void displayInfo() {
        System.out.println("Shepherd Dog Info");
        System.out.println("Name: " + super.dogName);
        System.out.println("Age: " + super.dogAgeMonths);
        System.out.println("Weight : " + super.dogWeightKg);
        System.out.println("Fur Color: " + this.furColor);
        System.out.println("Trained: " + this.isTrained);
        System.out.println("----------------------------");
    }
}