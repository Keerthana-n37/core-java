class Tablet{
	static String brand(){
		System.out.println("Executing brand method in tablet...");
		return "Samsung";
	}
	static String model(){
		System.out.println("Executing model method in tablet...");
		return "Galaxy Tab S9";
	}
	static int storage(){
		System.out.println("Executing storage method in tablet...");
		return 128;
	}
	static double price(){
		System.out.println("Executing price method in tablet...");
		return 59999;
	}
	static boolean hasStylus(){
		System.out.println("Executing hasStylus method in tablet...");
		return true;
	}
}