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

        System.out.println("Humidity Percent: " + humidityPercent);
        System.out.println("Cloud Height: " + cloudHeightKm );
        System.out.println("Is Stormy: " + isStormy);
        System.out.println("Cloud Density: " + cloudDensity);
        System.out.println("Temperature: " + temperatureCelsius);

        System.out.println("Wind: " + wind.description);
        System.out.println("Precipitation: " + precipitation.type);
        System.out.println("Sky Color: " + sky.color);
        System.out.println("Atmosphere: " + atmosphere.condition);
        System.out.println("Lightning: " + lightning.status);
    }
}