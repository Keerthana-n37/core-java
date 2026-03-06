class CloudRunner{

    public static void main(String[] args){

        Wind wind = new Wind("Breeze");
        Precipitation precipitation = new Precipitation("Drizzle");
        SkyColor sky = new SkyColor("Light Gray");
        Atmosphere atmosphere = new Atmosphere("Humid");
        Lightning lightning = new Lightning("No Lightning");

        Cloud cloud = new Cloud(78.5, 3.2, true, 7, 22.5f,
                wind, precipitation, sky, atmosphere, lightning);
    }
}