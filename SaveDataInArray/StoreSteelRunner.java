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
	}
}