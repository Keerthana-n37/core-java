class StoreScooterRunner
{
	public static void main(String[] args)
	{
		String[] scooterNames = new String[10];
		StoreScooterNames storeScooter = new StoreScooterNames(scooterNames);
		
		storeScooter.getScooterName("Activa");
		storeScooter.getScooterName("Jupiter");
		storeScooter.getScooterName("Access");
		storeScooter.getScooterName("Hero");
		storeScooter.getScooterName("Pleasure");
		storeScooter.getScooterName("Bajaj");
		storeScooter.getScooterName("Suzuki");
		storeScooter.getScooterName("VLF");
		storeScooter.getScooterName("Ather");
		storeScooter.getScooterName("Brisk");
		System.out.println("-------------------");
		
		System.out.println("Search Found");
        boolean found = storeScooter.searchScooterName("VLF");
        System.out.println("Result: " + found);
		System.out.println("-------------------");

        System.out.println("Search Not Found");
        boolean notFound = storeScooter.searchScooterName("TVS Scooty"); 
        System.out.println("Result: " + notFound);
		System.out.println("-------------------");

        System.out.println("Search Null");
        boolean nullCheck = storeScooter.searchScooterName(null);
        System.out.println("Result: " + nullCheck);
		System.out.println("-------------------");
		
		boolean updateIndex = storeScooter.update(2, "Burgman");
        System.out.println("Update by Index Result: " + updateIndex);
        System.out.println("-------------------");
		
		boolean updateName = storeScooter.update("Hero", "TVS");
        System.out.println("Update by Name Result: " + updateName);
        System.out.println("-------------------");
		
		String deletedIndex = storeScooter.delete(1);
        System.out.println("Deleted by Index: " + deletedIndex);
        System.out.println("-------------------");
		
		String deletedName = storeScooter.delete("Pleasure");
        System.out.println("Deleted by Name: " + deletedName);
        System.out.println("-------------------");
		
	}
}