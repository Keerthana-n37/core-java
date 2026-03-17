class StoreTreeRunner
{
	public static void main(String[] args)
	{
		String[] trees=new String[10];
		StoreTreeNames storeTreeNames=new StoreTreeNames(trees);

		storeTreeNames.getTreeName("Neem");
		storeTreeNames.getTreeName("Banyan");
		storeTreeNames.getTreeName("Mango");
		storeTreeNames.getTreeName("Coconut");
		storeTreeNames.getTreeName("Peepal");
		storeTreeNames.getTreeName("Teak");
		storeTreeNames.getTreeName("Oak");
		storeTreeNames.getTreeName("Pine");
		storeTreeNames.getTreeName("Maple");
		storeTreeNames.getTreeName("Ashoka");
		System.out.println("--------------------");
		
        System.out.println("Search Found");
        boolean found = storeTreeNames.searchTreeName("Teak");
        System.out.println("Result: " + found);
		System.out.println("--------------------");

        System.out.println("Search Not Found");
        boolean notFound = storeTreeNames.searchTreeName("Coconut"); 
        System.out.println("Result: " + notFound);
		System.out.println("--------------------");

        System.out.println("------Search Null------");
        boolean nullCheck = storeTreeNames.searchTreeName(null);
        System.out.println("Result: " + nullCheck);
	}
}