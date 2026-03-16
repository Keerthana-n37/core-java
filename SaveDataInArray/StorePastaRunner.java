class StorePastaRunner
{
	public static void main(String[] args)
	{
		String[] pasta=new String[10];
		StorePasta storePasta=new StorePasta(pasta);

		storePasta.getPastaName("Maggi Pasta");
		storePasta.getPastaName("Yippee Pasta");
		storePasta.getPastaName("Sunfeast Pasta");
		storePasta.getPastaName("DelMonte Pasta");
		storePasta.getPastaName("Weikfield Pasta");
		storePasta.getPastaName("Barilla Pasta");
		storePasta.getPastaName("Borges Pasta");
		storePasta.getPastaName("Bambino Pasta");
		storePasta.getPastaName("Smith Pasta");
		storePasta.getPastaName("Urban Pasta");
		System.out.println("--------------------");
		
		System.out.println("Search Found");
		boolean found = storePasta.searchPastaName("Maggi Pasta");
		System.out.println("Result: " + found);
		System.out.println("-----------------------");

		System.out.println("Search Not Found");
		boolean notFound = storePasta.searchPastaName("Nestle Pasta");
		System.out.println("Result: " + notFound);
		System.out.println("------------------------");

		System.out.println("Search Null");
		boolean nullCheck = storePasta.searchPastaName(null);
		System.out.println("Result: " + nullCheck);
	}
}