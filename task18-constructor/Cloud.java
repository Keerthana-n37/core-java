class Cloud{
    double humidityPercent;
    double cloudHeightKm;
    boolean isStormy;
    int cloudDensity;
    float temperatureCelsius;

    Wind wind;
    Precipitation precipitation;
    SkyColor sky;
    Atmosphere atmosphere;
    Lightning lightning;

    Cloud(double humidityPercent, double cloudHeightKm, boolean isStormy, int cloudDensity, float temperatureCelsius,
          Wind wind, Precipitation precipitation, SkyColor sky, Atmosphere atmosphere, Lightning lightning){

        System.out.println("Executing Cloud Constructor");

        this.humidityPercent = humidityPercent;
        this.cloudHeightKm = cloudHeightKm;
        this.isStormy = isStormy;
        this.cloudDensity = cloudDensity;
        this.temperatureCelsius = temperatureCelsius;

        this.wind = wind;
        this.precipitation = precipitation;
        this.sky = sky;
        this.atmosphere = atmosphere;
        this.lightning = lightning;
    }
	
	void getCloud()
	{
		System.out.println("Cloud details...");
		System.out.println("Humidity Percent: " + this.humidityPercent);
        System.out.println("Cloud Height: " + this.cloudHeightKm );
        System.out.println("Is Stormy: " + this.isStormy);
        System.out.println("Cloud Density: " + this.cloudDensity);
        System.out.println("Temperature: " + this.temperatureCelsius);
		
		
		if(this.wind!=null)
		{
			this.wind.getWindDetails();
		}
		else{
			System.out.println("Wind is not there");
		}
		if(this.precipitation!=null)
		{
			this.precipitation.getPrecepitation();
		}
		else{
			System.out.println("Precipitation is not there");
		}
		if(this.sky!=null)
		{
			this.sky.getSky();
		}
		else{
			System.out.println("Sky is not there");
		}
		if(this.atmosphere!=null)
		{
			this.atmosphere.getAtmosphere();
		}
		else{
			System.out.println("Atmosphere is not there");
		}
		if(this.lightning!=null)
		{
			this.lightning.getLightning();
		}
		else{
			System.out.println("Lightning is not there");
		}
	}
}