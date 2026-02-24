class WaterFall {

    static void info(String name, double height, String location, boolean isPopular) {
		System.out.println("Executing the info method.... ");
        System.out.println("Waterfall Name: " + name);
        System.out.println("Height: " + height + " meters");
        System.out.println("Location: " + location);
        System.out.println("Popular: " + isPopular);
        System.out.println("-----------------------------");
		if(name==null){
			System.out.println("This is invalid name");
			return;
		}
		if(height<=0.0){
			System.out.println("This is invalid height");
			return;
		}
		if(location==null){
			System.out.println("This is inavlid location");
			return;
		}
		System.out.println("THis is a valid data");
    }

    static void stateOwningInfo(String name, String state, double height, double waterFlow, boolean isTouristSpot) {
		 System.out.println("Executing the stateOwningInfo method....");
        System.out.println("Waterfall Name: " + name);
        System.out.println("State: " + state);
        System.out.println("Height: " + height + " meters");
        System.out.println("Water Flow: " + waterFlow );
        System.out.println("Tourist Spot: " + isTouristSpot);
        System.out.println("-----------------------------");
		if(name==null){
			System.out.println("This is invalid name");
			return;
		}
		if(state==null){
			System.out.println("THis is invalid state name");
			return;
		}
		if(height<=0.0){
			System.out.println("This is invalid height");
			return;
		}
		if(waterFlow<=0.0){
			System.out.println("This is invalid waterFlow parameter");
			return;
		}
		System.out.println("THis is a valid data");
    }
}