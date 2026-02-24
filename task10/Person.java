class Person {

    static void contactInfo(String name, String[] emails, long[] mobileNumbers, String address){
		System.out.println("----Person Contact Information----");
		System.out.println("Person Name:"+name);
		for(int i=0;i<emails.length;i++){
		System.out.println("Email:"+emails[i]);
		}
	    for(int j=0;j<mobileNumbers.length;j++){
		System.out.println("MobileNumber:"+mobileNumbers[j]);
		}
		System.out.println("Address:"+address);

        if (name == null) {
            System.out.println("Invalid name,give proper name for the person");
            return;
        }

        if (emails == null) {
            System.out.println("Emails cannot be empty");
            return;
        }
		
		if(emails.length == 0){
			System.out.println("Emails array cannot be empty");
			return;
		}

        if (mobileNumbers == null ){
            System.out.println("Mobile numbers cannot be empty");
            return;
        }
		if(mobileNumbers.length == 0){
			System.out.println("Mobile number array should not be empty");
			return;
		}

        if (address == null) {
            System.out.println("Invalid address");
            return;
        }
        System.out.println("This is valid information about contact info...");
		System.out.println("-------------------------");
	}
    static void foodDish(String name, String[] ingredients) {
        
		System.out.println("---- Food Dish ----");
        System.out.println("Dish Name: " + name);
		for(int k=0;k<ingredients.length;k++){
		System.out.println("Ingredients:"+ingredients[k]);
		}
        if (name == null){
            System.out.println("Invalid dish name,dish name cannot be null");
            return;
        }

        if (ingredients == null){
            System.out.println("Invalid it cannot be null");
            return;
        }
        if (ingredients.length==0){
            System.out.println("Array should contain elements ");
            return;
        }
        System.out.println("This is valid information about food dish...");
		System.out.println("-------------------------");

    }

    static void laptop(String brand, String model, String[] ports, String[] countriesOfWarranty) {

        System.out.println("---- Laptop Details ----");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
		for(int a=0;a<ports.length;a++){
		System.out.println("Ports:"+ports[a]);
		}
		for(int b=0;b<countriesOfWarranty.length;b++){
		System.out.println("CountriesOfWarranty:"+countriesOfWarranty[b]);
		}
		
		
        if (brand == null) {
            System.out.println("Invalid brand name");
            return;
        }

        if (model == null) {
            System.out.println("Invalid model");
            return;
        }

        if(ports == null) {
            System.out.println("Ports name cannot be empty");
            return;
        }
		if(ports.length == 0){
			System.out.println("Number of ports in array should contain elements....");
			return;
		}

        if (countriesOfWarranty == null) {
            System.out.println("Invaild data country name should not be null");
            return;
        }
		if(countriesOfWarranty.length == 0){
			System.out.println("Array of countries should contain some elements");
			return;
		}
        
        System.out.println("Laptop information is valid...");

    }
}
