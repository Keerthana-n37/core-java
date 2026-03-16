class StoreKettleRunner
{
	public static void main(String[] args)
	{
		String[] kettleNames = new String[10];
		StoreKettleNames storeKettle = new StoreKettleNames(kettleNames);
		
		storeKettle.getKettleName("Prestige");
		storeKettle.getKettleName("Pigeon");
		storeKettle.getKettleName("Butterfly");
		storeKettle.getKettleName("Philips");
		storeKettle.getKettleName("Bajaj");
		storeKettle.getKettleName("Havells");
		storeKettle.getKettleName("Usha");
		storeKettle.getKettleName("Orpat");
		storeKettle.getKettleName("Inalsa");
		storeKettle.getKettleName("MorphyRichards");
		System.out.println("-----------------------");
		
		System.out.println("Search Found");
		boolean found = storeKettle.searchKettleName("Bajaj");
		System.out.println("Result: " + found);
		System.out.println("----------------------");

		System.out.println("Search Not Found");
		boolean notFound = storeKettle.searchKettleName("Milton");
		System.out.println("Result: " + notFound);
		System.out.println("----------------------");

		System.out.println("Search Null");
		boolean nullCheck = storeKettle.searchKettleName(null);
		System.out.println("Result: " + nullCheck);
	}
}