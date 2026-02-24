class Bench{
	static String material(){
		System.out.println("Executing material method in bench...");
	    return "Wood";
	}
	static int seatingCapacity(){
		System.out.println("Executing seatingCapacity method in bench...");
		return 3;
	}
	static String color(){
		System.out.println("Executing color method in bench...");
		return "Brown";
	}
	static double price(){
		System.out.println("Executing price method in bench...");
		return 4500;
	}
	static boolean isOutdoor(){
		System.out.println("Executing isOutdoor method in bench...");
		return true;
	}
}