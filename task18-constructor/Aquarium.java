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

        System.out.println("Tank Volume: " + tankVolumeLiters);
        System.out.println("Water Temperature: " + waterTemperatureC);
        System.out.println("pH Level: ");
        System.out.println("Number of Fish: ");
        System.out.println("Has Heater: ");

        System.out.println("Filter: " + filter.type);
        System.out.println("Decoration: " + decoration.name);
        System.out.println("Lighting: " + lighting.style);
        System.out.println("Plants: " + plants.species);
        System.out.println("Feeding Schedule: " + feeding.schedule);
    }
}