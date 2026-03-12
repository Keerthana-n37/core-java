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
	}
}