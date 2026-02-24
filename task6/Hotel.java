class Hotel {

    static void hotelOrder(String itemName, int quantity, boolean parcel) {
        System.out.println("Item Name:" +itemName);
        System.out.println("Quantity:" +quantity);
        System.out.println("Parcel:" +parcel);
        System.out.println();
    }

    static void ownerInfo(String ownerName, String gstNo, double taxPaid, int age, String address) {
        System.out.println("Owner Name:" +ownerName);
        System.out.println("GST No:" +gstNo);
        System.out.println("Tax Paid:" +taxPaid);
        System.out.println("Age:" +age);
        System.out.println("Address:" +address);
        System.out.println();
    }

    static void staffInfo(String staffType, String staffName, double salary,String nativity, String email, long mobileNo) {
        System.out.println("Staff Type:"+staffType);
        System.out.println("Staff Name:"+staffName);
        System.out.println("Salary:" +salary);
        System.out.println("Nativity:" +nativity);
        System.out.println("Email:" +email);
        System.out.println("Mobile No:" +mobileNo);
        System.out.println();
    }

    static void hotelInfo(String hotelName, String hotelLocation, String hotelType,int hotelFloors,int hotelRooms,double hotelRating) {
        System.out.println("Hotel Name:" +hotelName);
        System.out.println("Location:" +hotelLocation);
        System.out.println("Type:" +hotelType);
        System.out.println("NoOfFloors:" +hotelFloors);
        System.out.println("NoOfRooms:" +hotelRooms);
		System.out.println("Rating:" +hotelRating);
        System.out.println();
    }
}