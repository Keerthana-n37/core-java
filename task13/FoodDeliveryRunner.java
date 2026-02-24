public class FoodDeliveryRunner {

    public static void main(String[] args) {

        FoodDeliveryApp f1 = new FoodDeliveryApp();
        FoodDeliveryApp f2 = new FoodDeliveryApp();
        FoodDeliveryApp f3 = new FoodDeliveryApp();
        FoodDeliveryApp f4 = new FoodDeliveryApp();
        FoodDeliveryApp f5 = new FoodDeliveryApp();

        System.out.println("App Name: " + f1.appName);
        System.out.println("Total Restaurants: " + f1.totalRestaurants);
        System.out.println("Headquarters: " + f1.headquarters);
        System.out.println("Delivery Charge: " + f1.deliveryCharge);

        f1.appName = "Swiggy";
        f1.totalRestaurants = 150000;
        f1.headquarters = "Bangalore";
        f1.deliveryCharge = 40;

        System.out.println("Re-initialising app details");
        System.out.println("App Name: " + f1.appName);
        System.out.println("Total Restaurants: " + f1.totalRestaurants);
        System.out.println("Headquarters: " + f1.headquarters);
        System.out.println("Delivery Charge: " + f1.deliveryCharge);
        System.out.println("------------------------------");


        System.out.println("App Name: " + f2.appName);
        System.out.println("Total Restaurants: " + f2.totalRestaurants);
        System.out.println("Headquarters: " + f2.headquarters);
        System.out.println("Delivery Charge: " + f2.deliveryCharge);

        f2.appName = "Zomato";
        f2.totalRestaurants = 120000;
        f2.headquarters = "Gurgaon";
        f2.deliveryCharge = 35;

        System.out.println("Re-initialising app details");
        System.out.println("App Name: " + f2.appName);
        System.out.println("Total Restaurants: " + f2.totalRestaurants);
        System.out.println("Headquarters: " + f2.headquarters);
        System.out.println("Delivery Charge: " + f2.deliveryCharge);
        System.out.println("------------------------------");

        System.out.println("App Name: " + f3.appName);
        System.out.println("Total Restaurants: " + f3.totalRestaurants);
        System.out.println("Headquarters: " + f3.headquarters);
        System.out.println("Delivery Charge: " + f3.deliveryCharge);

        f3.appName = "UberEats";
        f3.totalRestaurants = 90000;
        f3.headquarters = "San Francisco";
        f3.deliveryCharge = 50;

        System.out.println("Re-initialising app details");
        System.out.println("App Name: " + f3.appName);
        System.out.println("Total Restaurants: " + f3.totalRestaurants);
        System.out.println("Headquarters: " + f3.headquarters);
        System.out.println("Delivery Charge: " + f3.deliveryCharge);
        System.out.println("------------------------------");

        System.out.println("App Name: " + f4.appName);
        System.out.println("Total Restaurants: " + f4.totalRestaurants);
        System.out.println("Headquarters: " + f4.headquarters);
        System.out.println("Delivery Charge: " + f4.deliveryCharge);

        f4.appName = "Dunzo";
        f4.totalRestaurants = 60000;
        f4.headquarters = "Bangalore";
        f4.deliveryCharge = 45;

        System.out.println("Re-initialising app details");
        System.out.println("App Name: " + f4.appName);
        System.out.println("Total Restaurants: " + f4.totalRestaurants);
        System.out.println("Headquarters: " + f4.headquarters);
        System.out.println("Delivery Charge: " + f4.deliveryCharge);
        System.out.println("------------------------------");

        System.out.println("App Name: " + f5.appName);
        System.out.println("Total Restaurants: " + f5.totalRestaurants);
        System.out.println("Headquarters: " + f5.headquarters);
        System.out.println("Delivery Charge: " + f5.deliveryCharge);

        f5.appName = "Blinkit";
        f5.totalRestaurants = 75000;
        f5.headquarters = "Gurgaon";
        f5.deliveryCharge = 30;

        System.out.println("Re-initialising app details");
        System.out.println("App Name: " + f5.appName);
        System.out.println("Total Restaurants: " + f5.totalRestaurants);
        System.out.println("Headquarters: " + f5.headquarters);
        System.out.println("Delivery Charge: " + f5.deliveryCharge);
        System.out.println("------------------------------");

    }
}
