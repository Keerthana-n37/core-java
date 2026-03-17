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
		System.out.println("------------------------");
		
		boolean update1 = storePasta.update(1, "Nestle Pasta");
        System.out.println("Result: " + update1);
		System.out.println("------------------------");
		
		boolean update2 = storePasta.update(10, "ABC Pasta");
        System.out.println("Result: " + update2);
		System.out.println("------------------------");
		
		boolean updateName1 = storePasta.update("Nestle Pasta", "Maggi Pasta");
        System.out.println("Result: " + updateName1);
		System.out.println("------------------------");
		
		boolean updateName3 = storePasta.update(null, "Yippee Pasta");
        System.out.println("Result: " + updateName3);
		System.out.println("------------------------");
		
		boolean update3 = storePasta.update(2, null);
        System.out.println("Result: " + update3);
		System.out.println("------------------------");
		
		String delete1 = storePasta.delete(2);
        System.out.println("Result: " + delete1);
		System.out.println("------------------------");
		
		String delete2 = storePasta.delete(2);
        System.out.println("Result: " + delete2);
		System.out.println("------------------------");
		
		String delete3 = storePasta.delete(10);
        System.out.println("Result: " + delete3);
		System.out.println("------------------------");
		
		String delete4 = storePasta.delete("Maggi Pasta");
        System.out.println("Result: " + delete4);
		System.out.println("------------------------");
	}
}