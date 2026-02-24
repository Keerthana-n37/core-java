class FiberRunner{
	public static void main(String[] args)
	{
		Fiber fiber1=new Fiber();
		fiber1.name="Optical Fiber";
		fiber1.length=150.75;
		fiber1.vendors=new String[]{"Airtel","Jio","BSNL"};
		
		System.out.println("Fiber1 Details:");
		System.out.println("Name:"+fiber1.name);
		System.out.println("Length:"+fiber1.length);
		System.out.println("Vendors:");
		for(int index=0;index<fiber1.vendors.length;index++)
		{
			System.out.println(fiber1.vendors[index]);
		}
		System.out.println("-----------------");
		
		
		Fiber fiber2 = new Fiber();
		fiber2.name = "Copper Fiber";
		fiber2.length = 85.50;
		fiber2.vendors = new String[]{"ACT", "Hathway", "Spectra"};

		System.out.println("Fiber2 Details:");
		System.out.println("Name:" + fiber2.name);
		System.out.println("Length:" + fiber2.length);
		System.out.println("Vendors:");
		for(int index = 0; index < fiber2.vendors.length; index++)
		{
			System.out.println(fiber2.vendors[index]);
		}
		System.out.println("-----------------");
	}
}