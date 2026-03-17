class StoreSteelRunner
{
	public static void main(String[] args)
	{
		String[] steelNames = new String[10];
		StoreSteelNames storeSteel = new StoreSteelNames(steelNames);
		
		storeSteel.getSteelName("TATA Steel");
		storeSteel.getSteelName("JSW Steel");
		storeSteel.getSteelName("SAIL");
		storeSteel.getSteelName("Jindal Steel");
		storeSteel.getSteelName("Essar Steel");
		storeSteel.getSteelName("Bhushan Steel");
		storeSteel.getSteelName("Rashmi Steel");
		storeSteel.getSteelName("Mukand Steel");
		storeSteel.getSteelName("Visa Steel");
		storeSteel.getSteelName("Kirloskar Steel");
		System.out.println("-------------------");
		
		System.out.println("Search Found");
        boolean found = storeSteel.searchSteelName("Jindal Steel");
        System.out.println("Result: " + found);
		System.out.println("-------------------");

        System.out.println("Search Not Found");
        boolean notFound = storeSteel.searchSteelName("POSCO Steel"); 
        System.out.println("Result: " + notFound);
		System.out.println("-------------------");

        System.out.println("Search Null");
        boolean nullCheck = storeSteel.searchSteelName(null);
        System.out.println("Result: " + nullCheck);
		System.out.println("-------------------");
	}
}