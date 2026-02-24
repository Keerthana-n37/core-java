class Grenade{
	static String type(){
		System.out.println("Executing type method in Grenade...");
		return "Smoke";
	}
	static double weight(){
		System.out.println("Executing weight method in Grenade...");
		return 0.4;
	}
	static String color(){
		System.out.println("Executing color method in Grenade...");
		return "Green";
	}
	static boolean isReusable(){
		System.out.println("Executing isReusable method in Grenade...");
        return false;
    }

    static String origin(){
		System.out.println("Executing origin method in Grenade...");
        return "India";
    }
}