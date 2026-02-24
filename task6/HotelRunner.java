class HotelRunner{
	
	public static void main(String[] args)
	{   System.out.println("This is Hotel Order information:");
		String itemName = "Idli";
		int quantity = 4;
		boolean parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);
		
		itemName = "Dosa";
		quantity = 6;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Vada";
		quantity = 3;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Roti";
		quantity = 10;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Butter Naan";
		quantity = 8;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Paneer Curry";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Veg Meals";
		quantity = 3;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Curd Rice";
		quantity = 4;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Fried Rice";
		quantity = 5;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Noodles";
		quantity = 4;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Gobi Manchurian";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Parotta";
		quantity = 6;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Biryani";
		quantity = 2;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Chicken Curry";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Paneer Tikka";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Dal Fry";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Rajma";
		quantity = 4;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Chole";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Palav";
		quantity = 5;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Poori";
		quantity = 6;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Upma";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Pongal";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Kesari Bath";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Ice Cream";
		quantity = 5;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Gulab Jamun";
		quantity = 6;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Kheer";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Tea";
		quantity = 6;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Coffee";
		quantity = 6;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Lassi";
		quantity = 4;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Buttermilk";
		quantity = 5;
		parcel = false;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Soup";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Salad";
		quantity = 2;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Masala Papad";
		quantity = 3;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Cold Drink";
		quantity = 10;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);

		itemName = "Water Bottle";
		quantity = 12;
		parcel = true;
		Hotel.hotelOrder(itemName, quantity, parcel);
		
		
		System.out.println("This is Owner information of the Hotel:");
					
		String ownerName = "Ramesh";
		String gstNo = "29ABCDE1234F1Z5";
		double taxPaid = 250000;
		int age = 45;
		String address = "Bengaluru";
		Hotel.ownerInfo(ownerName, gstNo, taxPaid, age, address);

		ownerName = "Suresh";
		gstNo = "29ABCDE1234F2Z5";
		taxPaid = 180000;
		age = 50;
		address = "Mysuru";
		Hotel.ownerInfo(ownerName, gstNo, taxPaid, age, address);

		ownerName = "Mahesh";
		gstNo = "29ABCDE1234F3Z5";
		taxPaid = 300000;
		age = 48;
		address = "Tumakuru";
		Hotel.ownerInfo(ownerName, gstNo, taxPaid, age, address);

		ownerName = "Naresh";
		gstNo = "29ABCDE1234F4Z5";
		taxPaid = 150000;
		age = 42;
		address = "Mandya";
		Hotel.ownerInfo(ownerName, gstNo, taxPaid, age, address);

		ownerName = "Rajesh";
		gstNo = "29ABCDE1234F5Z5";
		taxPaid = 220000;
		age = 47;
		address = "Hassan";
		Hotel.ownerInfo(ownerName, gstNo, taxPaid, age, address);
		
		
		System.out.println("This is hotel staff information:");
		
		String staffType = "Cook";
		String staffName = "Rahul";
		double salary = 12000;
		String nativity = "Karnataka";
		String email = "rahul@gmail.com";
		long mobileNo = 9000000001L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Amit";
		salary = 13000;
		nativity = "Karnataka";
		email = "amit@gmail.com";
		mobileNo = 9000000002L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Suresh";
		salary = 10000;
		nativity = "Tamil Nadu";
		email = "suresh@gmail.com";
		mobileNo = 9000000003L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Ramesh";
		salary = 30000;
		nativity = "Kerala";
		email = "ramesh@gmail.com";
		mobileNo = 9000000004L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vikram";
		salary = 18000;
		nativity = "Andhra Pradesh";
		email = "vikram@gmail.com";
		mobileNo = 9000000005L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Arjun";
		salary = 12500;
		nativity = "Karnataka";
		email = "arjun@gmail.com";
		mobileNo = 9000000006L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Praveen";
		salary = 13500;
		nativity = "Karnataka";
		email = "praveen@gmail.com";
		mobileNo = 9000000007L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Manoj";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "manoj@gmail.com";
		mobileNo = 9000000008L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Anil";
		salary = 32000;
		nativity = "Kerala";
		email = "anil@gmail.com";
		mobileNo = 9000000009L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Rohit";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "rohit@gmail.com";
		mobileNo = 9000000010L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Vishal";
		salary = 12000;
		nativity = "Karnataka";
		email = "vishal@gmail.com";
		mobileNo = 9000000011L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Rajan";
		salary = 13000;
		nativity = "Karnataka";
		email = "rajan@gmail.com";
		mobileNo = 9000000012L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sanjay";
		salary = 10000;
		nativity = "Tamil Nadu";
		email = "sanjay@gmail.com";
		mobileNo = 9000000013L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Ajay";
		salary = 30000;
		nativity = "Kerala";
		email = "ajay@gmail.com";
		mobileNo = 9000000014L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Prasad";
		salary = 18000;
		nativity = "Andhra Pradesh";
		email = "prasad@gmail.com";
		mobileNo = 9000000015L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Harish";
		salary = 12500;
		nativity = "Karnataka";
		email = "harish@gmail.com";
		mobileNo = 9000000016L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Shiv";
		salary = 13500;
		nativity = "Karnataka";
		email = "shiv@gmail.com";
		mobileNo = 9000000017L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sathish";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sathish@gmail.com";
		mobileNo = 9000000018L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Kiran";
		salary = 32000;
		nativity = "Kerala";
		email = "kiran@gmail.com";
		mobileNo = 9000000019L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
		staffType = "Cashier";
		staffName = "Akash";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "akash@gmail.com";
		memail = "nikhil@gmail.com";
		mobileNo = 9000000020L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
		staffType = "Cashier";
		staffName = "VijayKumar";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vijaykumar@gmail.com";
		memail = "nikhil@gmail.com";
		mobileNo = 9000000021L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
		staffType = "Cashier";
		staffName = "Vishwas";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vishwas@gmail.com";
		memail = "nikhil@gmail.com";
		mobileNo = 9000000022L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vijay";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vijay@gmail.com";
		memail = "nikhil@gmail.com";
		mobileNo = 9000000023L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Aditya";
		salary = 30000;
		nativity = "Kerala";
		email = "aditya@gmail.com";
		mobileNo = 9000000024L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vasanth";
		salary = 18000;
		nativity = "Andhra Pradesh";
		email = "vasanth@gmail.com";
		mobileNo = 9000000025L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Shyam";
		salary = 12500;
		nativity = "Karnataka";
		email = "shyam@gmail.com";
		mobileNo = 9000000026L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Raju";
		salary = 13500;
		nativity = "Karnataka";
		email = "raju@gmail.com";
		mobileNo = 9000000027L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sandeep";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sandeep@gmail.com";
		mobileNo = 9000000028L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Kumar";
		salary = 32000;
		nativity = "Kerala";
		email = "kumar@gmail.com";
		mobileNo = 9000000029L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Raghavan";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "raghavan@gmail.com";
		mobileNo = 9000000030L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Ashok";
		salary = 12000;
		nativity = "Karnataka";
		email = "ashok@gmail.com";
		mobileNo = 9000000031L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Dinesh";
		salary = 13000;
		nativity = "Karnataka";
		email = "dinesh@gmail.com";
		mobileNo = 9000000032L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Girish";
		salary = 10000;
		nativity = "Tamil Nadu";
		email = "girish@gmail.com";
		mobileNo = 9000000033L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Prithvi";
		salary = 30000;
		nativity = "Kerala";
		email = "prithvi@gmail.com";
		mobileNo = 9000000034L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Sathya";
		salary = 18000;
		nativity = "Andhra Pradesh";
		email = "sathya@gmail.com";
		mobileNo = 9000000035L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Aravind";
		salary = 12500;
		nativity = "Karnataka";
		email = "aravind@gmail.com";
		mobileNo = 9000000036L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Lokesh";
		salary = 13500;
		nativity = "Karnataka";
		email = "lokesh@gmail.com";
		mobileNo = 9000000037L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Rajan";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "rajan@gmail.com";
		mobileNo = 9000000038L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Sandeep Kumar";
		salary = 32000;
		nativity = "Kerala";
		email = "sandeepkumar@gmail.com";
		mobileNo = 9000000039L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Raghunath";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "raghunath@gmail.com";
		mobileNo = 9000000040L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Vimal";
		salary = 12000;
		nativity = "Karnataka";
		email = "vimal@gmail.com";
		mobileNo = 9000000041L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Siddharth";
		salary = 13000;
		nativity = "Karnataka";
		email = "siddharth@gmail.com";
		mobileNo = 9000000042L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Pranav";
		salary = 10000;
		nativity = "Tamil Nadu";
		email = "pranav@gmail.com";
		mobileNo = 9000000043L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Aditya";
		salary = 30000;
		nativity = "Kerala";
		email = "aditya@gmail.com";
		mobileNo = 9000000044L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vasanth";
		salary = 18000;
		nativity = "Andhra Pradesh";
		email = "vasanth@gmail.com";
		mobileNo = 9000000045L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Shyam";
		salary = 12500;
		nativity = "Karnataka";
		email = "shyam@gmail.com";
		mobileNo = 9000000046L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Raju";
		salary = 13500;
		nativity = "Karnataka";
		email = "raju@gmail.com";
		mobileNo = 9000000047L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sandeep";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sandeep@gmail.com";
		mobileNo = 9000000048L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Kumar";
		salary = 32000;
		nativity = "Kerala";
		email = "kumar@gmail.com";
		mobileNo = 9000000049L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Raghavan";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "raghavan@gmail.com";
		mobileNo = 9000000050L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
			staffType = "Cook";
			staffName = "Ramesh";
			salary = 12000;
			nativity = "Karnataka";
			email = "ramesh@gmail.com";
			mobileNo = 9000000051L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Suresh";
			salary = 13000;
			nativity = "Karnataka";
			email = "suresh@gmail.com";
			mobileNo = 9000000052L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Mahesh";
			salary = 10000;
			nativity = "Tamil Nadu";
			email = "mahesh@gmail.com";
			mobileNo = 9000000053L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Rajesh";
			salary = 30000;
			nativity = "Kerala";
			email = "rajesh@gmail.com";
			mobileNo = 9000000054L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Naresh";
			salary = 18000;
			nativity = "Andhra Pradesh";
			email = "naresh@gmail.com";
			mobileNo = 9000000055L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Vikram";
			salary = 12500;
			nativity = "Karnataka";
			email = "vikram@gmail.com";
			mobileNo = 9000000056L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Arjun";
			salary = 13500;
			nativity = "Karnataka";
			email = "arjun@gmail.com";
			mobileNo = 9000000057L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Praveen";
			salary = 10500;
			nativity = "Tamil Nadu";
			email = "praveen@gmail.com";
			mobileNo = 9000000058L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Manoj";
			salary = 32000;
			nativity = "Kerala";
			email = "manoj@gmail.com";
			mobileNo = 9000000059L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Anil";
			salary = 18500;
			nativity = "Andhra Pradesh";
			email = "anil@gmail.com";
			mobileNo = 9000000060L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Vishal";
			salary = 12000;
			nativity = "Karnataka";
			email = "vishal@gmail.com";
			mobileNo = 9000000061L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Rohan";
			salary = 13000;
			nativity = "Karnataka";
			email = "rohan@gmail.com";
			mobileNo = 9000000062L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Sanjay";
			salary = 10000;
			nativity = "Tamil Nadu";
			email = "sanjay@gmail.com";
			mobileNo = 9000000063L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Amit";
			salary = 30000;
			nativity = "Kerala";
			email = "amit@gmail.com";
			mobileNo = 9000000064L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Venkatesh";
			salary = 18000;
			nativity = "Andhra Pradesh";
			email = "venkatesh@gmail.com";
			mobileNo = 9000000065L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Karthik";
			salary = 12500;
			nativity = "Karnataka";
			email = "karthik@gmail.com";
			mobileNo = 9000000066L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Deepak";
			salary = 13500;
			nativity = "Karnataka";
			email = "deepak@gmail.com";
			mobileNo = 9000000067L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Suresh Kumar";
			salary = 10500;
			nativity = "Tamil Nadu";
			email = "sureshkumar@gmail.com";
			mobileNo = 9000000068L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Harish";
			salary = 32000;
			nativity = "Kerala";
			email = "harish@gmail.com";
			mobileNo = 9000000069L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Prasad";
			salary = 18500;
			nativity = "Andhra Pradesh";
			email = "prasad@gmail.com";
			mobileNo = 9000000070L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Raghav";
			salary = 12000;
			nativity = "Karnataka";
			email = "raghav@gmail.com";
			mobileNo = 9000000071L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Akhil";
			salary = 13000;
			nativity = "Karnataka";
			email = "akhil@gmail.com";
			mobileNo = 9000000072L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Nikhil";
			salary = 10000;
			nativity = "Tamil Nadu";
			email = "nikhil@gmail.com";
			mobileNo = 9000000073L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Shiv";
			salary = 30000;
			nativity = "Kerala";
			email = "shiv@gmail.com";
			mobileNo = 9000000074L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Vijay";
			salary = 18000;
			nativity = "Andhra Pradesh";
			email = "vijay@gmail.com";
			mobileNo = 9000000075L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Ajay";
			salary = 12500;
			nativity = "Karnataka";
			email = "ajay@gmail.com";
			mobileNo = 9000000076L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Rohit";
			salary = 13500;
			nativity = "Karnataka";
			email = "rohit@gmail.com";
			mobileNo = 9000000077L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Sathish";
			salary = 10500;
			nativity = "Tamil Nadu";
			email = "sathish@gmail.com";
			mobileNo = 9000000078L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Kiran";
			salary = 32000;
			nativity = "Kerala";
			email = "kiran@gmail.com";
			mobileNo = 9000000079L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Balaji";
			salary = 18500;
			nativity = "Andhra Pradesh";
			email = "balaji@gmail.com";
			mobileNo = 9000000080L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Vimal";
			salary = 12000;
			nativity = "Karnataka";
			email = "vimal@gmail.com";
			mobileNo = 9000000081L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Siddharth";
			salary = 13000;
			nativity = "Karnataka";
			email = "siddharth@gmail.com";
			mobileNo = 9000000082L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Pranav";
			salary = 10000;
			nativity = "Tamil Nadu";
			email = "pranav@gmail.com";
			mobileNo = 9000000083L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Aditya";
			salary = 30000;
			nativity = "Kerala";
			email = "aditya@gmail.com";
			mobileNo = 9000000084L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Vasanth";
			salary = 18000;
			nativity = "Andhra Pradesh";
			email = "vasanth@gmail.com";
			mobileNo = 9000000085L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Shyam";
			salary = 12500;
			nativity = "Karnataka";
			email = "shyam@gmail.com";
			mobileNo = 9000000086L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Raju";
			salary = 13500;
			nativity = "Karnataka";
			email = "raju@gmail.com";
			mobileNo = 9000000087L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Sandeep";
			salary = 10500;
			nativity = "Tamil Nadu";
			email = "sandeep@gmail.com";
			mobileNo = 9000000088L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Kumar";
			salary = 32000;
			nativity = "Kerala";
			email = "kumar@gmail.com";
			mobileNo = 9000000089L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Raghavan";
			salary = 18500;
			nativity = "Andhra Pradesh";
			email = "raghavan@gmail.com";
			mobileNo = 9000000090L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Ashok";
			salary = 12000;
			nativity = "Karnataka";
			email = "ashok@gmail.com";
			mobileNo = 9000000091L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Dinesh";
			salary = 13000;
			nativity = "Karnataka";
			email = "dinesh@gmail.com";
			mobileNo = 9000000092L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Girish";
			salary = 10000;
			nativity = "Tamil Nadu";
			email = "girish@gmail.com";
			mobileNo = 9000000093L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Prithvi";
			salary = 30000;
			nativity = "Kerala";
			email = "prithvi@gmail.com";
			mobileNo = 9000000094L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Sathya";
			salary = 18000;
			nativity = "Andhra Pradesh";
			email = "sathya@gmail.com";
			mobileNo = 9000000095L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cook";
			staffName = "Aravind";
			salary = 12500;
			nativity = "Karnataka";
			email = "aravind@gmail.com";
			mobileNo = 9000000096L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Waiter";
			staffName = "Lokesh";
			salary = 13500;
			nativity = "Karnataka";
			email = "lokesh@gmail.com";
			mobileNo = 9000000097L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cleaner";
			staffName = "Rajan";
			salary = 10500;
			nativity = "Tamil Nadu";
			email = "rajan@gmail.com";
			mobileNo = 9000000098L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Manager";
			staffName = "Sandeep Kumar";
			salary = 32000;
			nativity = "Kerala";
			email = "sandeepkumar@gmail.com";
			mobileNo = 9000000099L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

			staffType = "Cashier";
			staffName = "Raghunath";
			salary = 18500;
			nativity = "Andhra Pradesh";
			email = "raghunath@gmail.com";
			mobileNo = 9000000100L;
			Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
		staffType = "Cook";
		staffName = "Raman";
		salary = 12500;
		nativity = "Karnataka";
		email = "raman101@gmail.com";
		mobileNo = 9000000101L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Sandeep";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "sandeep102@gmail.com";
		mobileNo = 9000000102L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Mahesh";
		salary = 10500;
		nativity = "Kerala";
		email = "mahesh103@gmail.com";
		mobileNo = 9000000103L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Venkatesh";
		salary = 32000;
		nativity = "Karnataka";
		email = "venkatesh104@gmail.com";
		mobileNo = 9000000104L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Prakash";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "prakash105@gmail.com";
		mobileNo = 9000000105L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Anil";
		salary = 12500;
		nativity = "Karnataka";
		email = "anil106@gmail.com";
		mobileNo = 9000000106L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Rohit";
		salary = 13500;
		nativity = "Karnataka";
		email = "rohit107@gmail.com";
		mobileNo = 9000000107L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Suresh";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "suresh108@gmail.com";
		mobileNo = 9000000108L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Aravind";
		salary = 32000;
		nativity = "Kerala";
		email = "aravind109@gmail.com";
		mobileNo = 9000000109L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Karthik";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "karthik110@gmail.com";
		mobileNo = 9000000110L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
	    staffType = "Cook";
		staffName = "Naveen";
		salary = 12500;
		nativity = "Karnataka";
		email = "naveen111@gmail.com";
		mobileNo = 9000000111L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Kiran";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "kiran112@gmail.com";
		mobileNo = 9000000112L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Raju";
		salary = 10500;
		nativity = "Kerala";
		email = "raju113@gmail.com";
		mobileNo = 9000000113L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Srinivas";
		salary = 32000;
		nativity = "Karnataka";
		email = "srinivas114@gmail.com";
		mobileNo = 9000000114L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Naresh";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "naresh115@gmail.com";
		mobileNo = 9000000115L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Manoj";
		salary = 12500;
		nativity = "Karnataka";
		email = "manoj116@gmail.com";
		mobileNo = 9000000116L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Vinay";
		salary = 13500;
		nativity = "Karnataka";
		email = "vinay117@gmail.com";
		mobileNo = 9000000117L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Mohan";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "mohan118@gmail.com";
		mobileNo = 9000000118L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Raghav";
		salary = 32000;
		nativity = "Kerala";
		email = "raghav119@gmail.com";
		mobileNo = 9000000119L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Deepak";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "deepak120@gmail.com";
		mobileNo = 9000000120L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Sathish";
		salary = 12500;
		nativity = "Karnataka";
		email = "sathish121@gmail.com";
		mobileNo = 9000000121L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Lokesh";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "lokesh122@gmail.com";
		mobileNo = 9000000122L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Shankar";
		salary = 10500;
		nativity = "Kerala";
		email = "shankar123@gmail.com";
		mobileNo = 9000000123L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Ashok";
		salary = 32000;
		nativity = "Karnataka";
		email = "ashok124@gmail.com";
		mobileNo = 9000000124L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Ramesh";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "ramesh125@gmail.com";
		mobileNo = 9000000125L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Umesh";
		salary = 12500;
		nativity = "Karnataka";
		email = "umesh126@gmail.com";
		mobileNo = 9000000126L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Pavan";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "pavan127@gmail.com";
		mobileNo = 9000000127L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Joseph";
		salary = 10500;
		nativity = "Kerala";
		email = "joseph128@gmail.com";
		mobileNo = 9000000128L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Praveen";
		salary = 32000;
		nativity = "Karnataka";
		email = "praveen129@gmail.com";
		mobileNo = 9000000129L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Sunil";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "sunil130@gmail.com";
		mobileNo = 9000000130L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
		
		staffType = "Cook";
		staffName = "Harsha";
		salary = 12500;
		nativity = "Karnataka";
		email = "harsha131@gmail.com";
		mobileNo = 9000000131L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Darshan";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "darshan132@gmail.com";
		mobileNo = 9000000132L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Binu";
		salary = 10500;
		nativity = "Kerala";
		email = "binu133@gmail.com";
		mobileNo = 9000000133L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Nithin";
		salary = 32000;
		nativity = "Karnataka";
		email = "nithin134@gmail.com";
		mobileNo = 9000000134L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Madhav";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "madhav135@gmail.com";
		mobileNo = 9000000135L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Krishna";
		salary = 12500;
		nativity = "Karnataka";
		email = "krishna136@gmail.com";
		mobileNo = 9000000136L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Nikhil";
		salary = 13500;
		nativity = "Karnataka";
		email = "nikhil137@gmail.com";
		mobileNo = 9000000137L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Raghu";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "raghu138@gmail.com";
		mobileNo = 9000000138L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Shivakumar";
		salary = 32000;
		nativity = "Kerala";
		email = "shivakumar139@gmail.com";
		mobileNo = 9000000139L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Sagar";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "sagar140@gmail.com";
		mobileNo = 9000000140L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Chandan";
		salary = 12500;
		nativity = "Karnataka";
		email = "chandan141@gmail.com";
		mobileNo = 9000000141L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Tejas";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "tejas142@gmail.com";
		mobileNo = 9000000142L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Antony";
		salary = 10500;
		nativity = "Kerala";
		email = "antony143@gmail.com";
		mobileNo = 9000000143L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Rajesh";
		salary = 32000;
		nativity = "Karnataka";
		email = "rajesh144@gmail.com";
		mobileNo = 9000000144L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Kiranraj";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "kiranraj145@gmail.com";
		mobileNo = 9000000145L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Vijay";
		salary = 12500;
		nativity = "Karnataka";
		email = "vijay146@gmail.com";
		mobileNo = 9000000146L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Abhishek";
		salary = 13500;
		nativity = "Karnataka";
		email = "abhishek147@gmail.com";
		mobileNo = 9000000147L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Selvam";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "selvam148@gmail.com";
		mobileNo = 9000000148L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Faizal";
		salary = 32000;
		nativity = "Kerala";
		email = "faizal149@gmail.com";
		mobileNo = 9000000149L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Ajay";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "ajay150@gmail.com";
		mobileNo = 9000000150L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);
	
		staffType = "Cook";
		staffName = "Ramanathan";
		salary = 12500;
		nativity = "Karnataka";
		email = "ramanathan@gmail.com";
		mobileNo = 9000000151L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Sandeep Kumar";
		salary = 13500;
		nativity = "Tamil Nadu";
		email = "sandeepkumar@gmail.com";
		mobileNo = 9000000152L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Harish";
		salary = 10500;
		nativity = "Kerala";
		email = "harish@gmail.com";
		mobileNo = 9000000153L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Vivek";
		salary = 32000;
		nativity = "Karnataka";
		email = "vivek@gmail.com";
		mobileNo = 9000000154L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Pradeep";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "pradeep@gmail.com";
		mobileNo = 9000000155L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Anand";
		salary = 12500;
		nativity = "Karnataka";
		email = "anand@gmail.com";
		mobileNo = 9000000156L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Rohith";
		salary = 13500;
		nativity = "Karnataka";
		email = "rohith@gmail.com";
		mobileNo = 9000000157L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Suresh";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "suresh@gmail.com";
		mobileNo = 9000000158L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Arjun";
		salary = 32000;
		nativity = "Kerala";
		email = "arjun@gmail.com";
		mobileNo = 9000000159L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vikram";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vikram@gmail.com";
		mobileNo = 9000000160L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Karthik";
		salary = 12500;
		nativity = "Karnataka";
		email = "karthik@gmail.com";
		mobileNo = 9000000161L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Ramesh";
		salary = 13500;
		nativity = "Karnataka";
		email = "ramesh@gmail.com";
		mobileNo = 9000000162L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Mahesh";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "mahesh@gmail.com";
		mobileNo = 9000000163L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Rajesh";
		salary = 32000;
		nativity = "Kerala";
		email = "rajesh@gmail.com";
		mobileNo = 9000000164L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Naresh";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "naresh@gmail.com";
		mobileNo = 9000000165L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Vikram";
		salary = 12500;
		nativity = "Karnataka";
		email = "vikram@gmail.com";
		mobileNo = 9000000166L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Arjun";
		salary = 13500;
		nativity = "Karnataka";
		email = "arjun@gmail.com";
		mobileNo = 9000000167L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Praveen";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "praveen@gmail.com";
		mobileNo = 9000000168L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Manoj";
		salary = 32000;
		nativity = "Kerala";
		email = "manoj@gmail.com";
		mobileNo = 9000000169L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Anil";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "anil@gmail.com";
		mobileNo = 9000000170L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Vishal";
		salary = 12500;
		nativity = "Karnataka";
		email = "vishal@gmail.com";
		mobileNo = 9000000171L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Rohan";
		salary = 13500;
		nativity = "Karnataka";
		email = "rohan@gmail.com";
		mobileNo = 9000000172L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sanjay";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sanjay@gmail.com";
		mobileNo = 9000000173L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Amit";
		salary = 32000;
		nativity = "Kerala";
		email = "amit@gmail.com";
		mobileNo = 9000000174L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Venkatesh";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "venkatesh@gmail.com";
		mobileNo = 9000000175L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Karthik";
		salary = 12500;
		nativity = "Karnataka";
		email = "karthik@gmail.com";
		mobileNo = 9000000176L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Deepak";
		salary = 13500;
		nativity = "Karnataka";
		email = "deepak@gmail.com";
		mobileNo = 9000000177L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Suresh Kumar";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sureshkumar@gmail.com";
		mobileNo = 9000000178L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Harish";
		salary = 32000;
		nativity = "Kerala";
		email = "harish@gmail.com";
		mobileNo = 9000000179L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Prasad";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "prasad@gmail.com";
		mobileNo = 9000000180L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Raghav";
		salary = 12500;
		nativity = "Karnataka";
		email = "raghav@gmail.com";
		mobileNo = 9000000181L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Akhil";
		salary = 13500;
		nativity = "Karnataka";
		email = "akhil@gmail.com";
		mobileNo = 9000000182L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Nikhil";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "nikhil@gmail.com";
		mobileNo = 9000000183L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Shiv";
		salary = 32000;
		nativity = "Kerala";
		email = "shiv@gmail.com";
		mobileNo = 9000000184L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vijay";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vijay@gmail.com";
		mobileNo = 9000000185L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Rohith";
		salary = 12500;
		nativity = "Karnataka";
		email = "rohith@gmail.com";
		mobileNo = 9000000186L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Siddharth";
		salary = 13500;
		nativity = "Karnataka";
		email = "siddharth@gmail.com";
		mobileNo = 9000000187L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Pranav";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "pranav@gmail.com";
		mobileNo = 9000000188L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Aditya";
		salary = 32000;
		nativity = "Kerala";
		email = "aditya@gmail.com";
		mobileNo = 9000000189L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Vasanth";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "vasanth@gmail.com";
		mobileNo = 9000000190L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Shyam";
		salary = 12500;
		nativity = "Karnataka";
		email = "shyam@gmail.com";
		mobileNo = 9000000191L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Raju";
		salary = 13500;
		nativity = "Karnataka";
		email = "raju@gmail.com";
		mobileNo = 9000000192L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Sandeep";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "sandeep@gmail.com";
		mobileNo = 9000000193L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Manager";
		staffName = "Kumar";
		salary = 32000;
		nativity = "Kerala";
		email = "kumar@gmail.com";
		mobileNo = 9000000194L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Raghavan";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "raghavan@gmail.com";
		mobileNo = 9000000195L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cook";
		staffName = "Ashok";
		salary = 12500;
		nativity = "Karnataka";
		email = "ashok@gmail.com";
		mobileNo = 9000000196L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Waiter";
		staffName = "Dinesh";
		salary = 13500;
		nativity = "Karnataka";
		email = "dinesh@gmail.com";
		mobileNo = 9000000197L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cleaner";
		staffName = "Girish";
		salary = 10500;
		nativity = "Tamil Nadu";
		email = "girish@gmail.com";
		mobileNo = 9000000198L;
	
		staffType = "Manager";
		staffName = "Prithvi";
		salary = 32000;
		nativity = "Kerala";
		email = "prithvi@gmail.com";
		mobileNo = 9000000199L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);

		staffType = "Cashier";
		staffName = "Sathya";
		salary = 18500;
		nativity = "Andhra Pradesh";
		email = "sathya@gmail.com";
		mobileNo = 9000000200L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);	

        staffType = "Cashier";
		staffName = "Sathish";
		salary = 19500;
		nativity = "Karnataka";
		email = "sathish@gmail.com";
		mobileNo = 9000000201L;
		Hotel.staffInfo(staffType, staffName, salary, nativity, email, mobileNo);	

	
        System.out.println("These are the details about the hotel in BTM Bengaluru:");
		String hotelName = "Spice Villa";
		String hotelLocation = "BTM Layout, Bangalore";
		String hotelType = "3-Star";
		int hotelFloors = 3;
		int hotelRooms = 25;
		double hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Blue Lagoon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 40;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Orchid";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 7;
		hotelRooms = 60;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Lotus Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 30;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Diamond Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 45;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Emerald Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Ocean View BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 35;
		hotelRating = 4.2;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Hillside BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 32;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "City Comfort BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 38;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Grand Horizon BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 8;
		hotelRooms = 70;
		hotelRating = 4.6;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Maple Leaf BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 28;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Pearl Residency BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 42;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Silver Oak BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 25;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Golden Tulip BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 9;
		hotelRooms = 80;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Maple Inn BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Cinnamon BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 27;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Maple Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 44;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Palm Grove";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 35;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Sunset Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 40;
		hotelRating = 4.2;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Harmony Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 30;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Lotus Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 8;
		hotelRooms = 70;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Serene Stay";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Crest Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 42;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Orchid BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 7;
		hotelRooms = 60;
		hotelRating = 4.6;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Palm Tree Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 25;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Golden Horizon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 9;
		hotelRooms = 80;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Maple Leaf Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Sunflower Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 32;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Lotus Grand";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 45;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Emerald Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Ocean Pearl";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Hillside Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 32;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "City View BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 40;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Grand Maple";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 8;
		hotelRooms = 70;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Cinnamon Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 27;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Lotus View";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 45;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Maple";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 7;
		hotelRooms = 60;
		hotelRating = 4.6;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Serene Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Crest Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 42;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Lotus";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 9;
		hotelRooms = 80;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Palm Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 25;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Golden Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Emerald Grand";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 32;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Ocean Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 45;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Hillside Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "City Horizon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 40;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Grand Lotus";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 8;
		hotelRooms = 70;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Cinnamon Inn";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 27;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Lotus Residency BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 45;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Horizon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 7;
		hotelRooms = 60;
		hotelRating = 4.6;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Serene Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Crest Inn BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 42;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Royal Maple BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "5-Star";
		hotelFloors = 9;
		hotelRooms = 80;
		hotelRating = 4.7;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Palm Horizon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 25;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Golden Residency";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 6;
		hotelRooms = 50;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Emerald Horizon";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 4;
		hotelRooms = 32;
		hotelRating = 4.1;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Ocean Suites";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 45;
		hotelRating = 4.4;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "Hillside Grand";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "3-Star";
		hotelFloors = 3;
		hotelRooms = 28;
		hotelRating = 4.0;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);

		hotelName = "City Maple BTM";
		hotelLocation = "BTM Layout, Bangalore";
		hotelType = "4-Star";
		hotelFloors = 5;
		hotelRooms = 40;
		hotelRating = 4.3;
		Hotel.hotelInfo(hotelName, hotelLocation, hotelType, hotelFloors, hotelRooms, hotelRating);
	}
}