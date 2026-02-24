class Bag {
     static void bagInfo(String bagName, String color, double capacity) {
		 System.out.println("Executing the baginfo method...");
        System.out.println("Bag Name: " + bagName);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("-----------------------------");
		if(bagName==null){
			System.out.println("This is invalid data bag name cannot be null");
			return;
		}
		if(color==null){
			System.out.println("This is invalid color bag must have color");
			return;
		}
		if(double<=0.0){
			System.out.println("THis is invalid bag capacity cannot be zero ");
			return;
		}
    }

    static void addItem(String bagName, String itemName, int quantity) {
		System.out.println("Executing the additem method...");
        System.out.println("Bag: " + bagName);
        System.out.println("Adding Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("-----------------------------");
		if(bagName==null){
			System.out.println("This is invalid data bag name cannot be null");
			return;
		}
		if(itemName==null){
			System.out.println("This is invalid,bag must contain the items");
			return;
		}
		if(quantity=0){
			System.out.println("This is invalid quantity");
			return;
		}
		System.out.println("This is valid data");
    }
	
}	
