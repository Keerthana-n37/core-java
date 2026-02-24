class Water{
	static String state(){
		System.out.println("Executing state method in water...");
		return "Liquid";
	}
	static double boilingPoint(){
		System.out.println("Executing boilingPoint method in water...");
		return 100.0;
	}
	static double freezingPoint(){
		System.out.println("Executing freezingPoint method in water...");
		return 0.0;
	}
	static boolean isDrinkable(){
		System.out.println("Executing isDrinkable method in water...");
		return true;
	}
	static String source(){
		System.out.println("Executing source method in water...");
		return "River";
	}
}