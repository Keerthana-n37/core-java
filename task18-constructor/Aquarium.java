class Aquarium{

    double tankVolumeLiters;
    float waterTemperatureC;
    double phLevel;
    int fishCount;
    boolean hasHeater;

    Filter filter;
    Decor decoration;
    Lighting lighting;
    AquaticPlant plants;
    FeedingSchedule feeding;

    Aquarium(double tankVolumeLiters, float waterTemperatureC, double phLevel, int fishCount, boolean hasHeater,
             Filter filter, Decor decoration, Lighting lighting, AquaticPlant plants, FeedingSchedule feeding) {

        System.out.println("Executing Aquarium Constructor");

        this.tankVolumeLiters = tankVolumeLiters;
        this.waterTemperatureC = waterTemperatureC;
        this.phLevel = phLevel;
        this.fishCount = fishCount;
        this.hasHeater = hasHeater;

        this.filter = filter;
        this.decoration = decoration;
        this.lighting = lighting;
        this.plants = plants;
        this.feeding = feeding;

    }
	
	void getInfo()
	{
		System.out.println("Aquarium details...");
		System.out.println("Tank Volume: " + this.tankVolumeLiters);
        System.out.println("Water Temperature: " + this.waterTemperatureC);
        System.out.println("pH Level: "+this.phLevel);
        System.out.println("Number of Fish: "+this.fishCount);
        System.out.println("Has Heater: "+this.hasHeater);
		
		if(this.filter!=null)
		{
			this.filter.getDetails();
		}
		else{
			System.out.println("Filter is not there");
		}
		
		if(this.decoration!=null)
		{
			this.decoration.getDetails();
		}
		else{
			System.out.println("Decoration is not there");
		}
		
		if(this.lighting!=null)
		{
			this.lighting.getDetails();
		}
		else{
			System.out.println("Lighting is not there");
		}
		
		if(this.plants!=null)
		{
			this.plants.getDetails();
		}
		else{
			System.out.println("Plants are not there");
		}
		
		if(this.feeding!=null)
		{
			this.feeding.getDetails();
		}
		else{
			System.out.println("Plants are not there");
		}
	}
}