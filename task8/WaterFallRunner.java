 class WaterFallRunner {
    public static void main(String[] args) {

        String name;
        double height;
        String location;
        boolean isPopular;
        String state;
        double waterFlow;
        boolean isTouristSpot;
       
        name = "Niagara"; height = 51; location = "USA/Canada"; isPopular = true;
        WaterFall.info(name, height, location, isPopular);

        name = "Iguazu"; height = 82; location = "Argentina/Brazil"; isPopular = true;
        WaterFall.info(name, height, location, isPopular);

        name = "Victoria"; height = 108; location = "Zambia/Zimbabwe"; isPopular = true;
        WaterFall.info(name, height, location, isPopular);

        name = "Angel"; height = 979; location = "Venezuela"; isPopular = false;
        WaterFall.info(name, height, location, isPopular);

        name = "Jog"; height = 253; location = "India"; isPopular = true;
        WaterFall.info(name, height, location, isPopular);
		
        name = "Niagara"; state = "New York"; height = 51; waterFlow = 2400; isTouristSpot = true;
        WaterFall.stateOwningInfo(name, state, height, waterFlow, isTouristSpot);

        name = "Iguazu"; state = "Misiones/Paraná"; height = 82; waterFlow = 1750; isTouristSpot = true;
        WaterFall.stateOwningInfo(name, state, height, waterFlow, isTouristSpot);

        name = "Victoria"; state = "Zambezi"; height = 108; waterFlow = 1080; isTouristSpot = true;
        WaterFall.stateOwningInfo(name, state, height, waterFlow, isTouristSpot);

        name = "Angel"; state = "Bolívar"; height = 979; waterFlow = 500; isTouristSpot = false;
        WaterFall.stateOwningInfo(name, state, height, waterFlow, isTouristSpot);

        name = "Jog"; state = "Karnataka"; height = 253; waterFlow = 90; isTouristSpot = true;
        WaterFall.stateOwningInfo(name, state, height, waterFlow, isTouristSpot);
    }
}