class MobileStore {

    
    static double getPrice(String brand) {

        if(brand == null) {
            System.out.println("Invalid data, brand cannot be null");
            return 0;
        }

        if(brand=="SAMSUNG") {
            return 25000;
        }

        if(brand=="APPLE") {
            return 70000;
        }

        if(brand=="VIVO") {
            return 15000;
        }

        System.out.println(brand + " not found in store");
        return 0;
    }

    static int getWarranty(String brand) {

        if(brand == null) {
            System.out.println("Invalid data, brand cannot be null");
            return 0;
        }

        if(brand=="SAMSUNG") {
            return 2;
        }
		if(brand=="APPLE"){
			return 2;
		}

        if(brand=="VIVO") {
            return 1;
        }

        System.out.println(brand + " not found in store");

        return 0;
    }

    static String getCountry(String brand) {

        if(brand == null) {
            System.out.println("Invalid data, brand cannot be null");
            return null;
        }

        if(brand=="SAMSUNG") {
            return "South Korea";
        }

        if(brand=="APPLE") {
            return "USA";
        }

        if(brand=="VIVO") {
            return "China";
        }

        System.out.println(brand + " not found in store");
        return null;
    }

   
}
