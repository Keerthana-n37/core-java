class StorePetroleumCompanyRunner
{
	public static void main(String[] args)
	{
		String[] companyName=new String[5];
		StorePetroleumCompany storePetroleumCompany=new StorePetroleumCompany(companyName);
		
		storePetroleumCompany.getCompanyName("Indian oil");
		storePetroleumCompany.getCompanyName("Bharath Petroleum");
		storePetroleumCompany.getCompanyName("Reliance Petroleum");
		storePetroleumCompany.getCompanyName("Hindustan Petroleum");
		storePetroleumCompany.getCompanyName("Nayara");
		System.out.println("---------------------");
		
		System.out.println("Search Found");
		boolean found = storePetroleumCompany.searchCompanyName("Indian oil");
		System.out.println("Result: " + found);
		System.out.println("---------------------");
		
		System.out.println("Search Not Found");
		boolean notFound = storePetroleumCompany.searchCompanyName("Adani Petroleum");
		System.out.println("Result: " + notFound);
		System.out.println("---------------------");
		
		System.out.println("Search Null");
		boolean nullCheck = storePetroleumCompany.searchCompanyName(null);
		System.out.println("Result: " + nullCheck);
	}
}