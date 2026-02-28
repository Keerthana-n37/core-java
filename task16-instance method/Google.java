class Google{
	int companyId;
	String companyName;
	String founder;
	String ceo;
	int foundedYear;
	String headquarters;
	int employeeCount;
	double revenue;
	String mainProduct;
	String secondaryProduct;
	boolean publicCompany;
	String stockSymbol;
	int totalBranches;
	String country;
	String website;
	double marketShare;
	String parentCompany;
	int totalUsers;
	double companyRating;
	String companyCategory;


    Google(int companyId, String companyName, String founder, String ceo,
           int foundedYear, String headquarters, int employeeCount,
           double revenue, String mainProduct, String secondaryProduct,
           boolean isPublicCompany, String stockSymbol, int totalBranches,
           String country, String website, double marketShare,
           String parentCompany, int totalUsers,
           double companyRating, String companyCategory)
		   {
			   this.companyId=companyId;
			   this.companyName=companyName;
			   this.founder=founder;
			   this.ceo=ceo;
			   this.foundedYear=foundedYear;
			   this.headquarters=headquarters;
			   this.employeeCount=employeeCount;
			   this.revenue=revenue;
			   this.mainProduct=mainProduct;
			   this.secondaryProduct=secondaryProduct;
			   this.publicCompany=publicCompany;
			   this.stockSymbol=stockSymbol;
			   this.totalBranches=totalBranches;
			   this.country=country;
			   this.website=website;
			   this.marketShare=marketShare;
			   this.parentCompany=parentCompany;
			   this.totalUsers=totalUsers;
			   this.companyRating=companyRating;
			   this.companyCategory=companyCategory;
		   }
		void googleInfo()
		{
			System.out.println("Company Id:"+companyId);
			System.out.println("Company Name:"+companyName);
			System.out.println("Founder:"+founder);
			System.out.println("CEO:"+ceo);
			System.out.println("Founded year:"+foundedYear);
			System.out.println("Headquarters:"+headquarters);
			System.out.println("Employees:"+employeeCount);
			System.out.println("Revenue:"+revenue);
			System.out.println("Main product:"+mainProduct);
			System.out.println("Secondary Product:"+secondaryProduct);
			System.out.println("Public company:"+publicCompany);
			System.out.println("Stock Symbol:"+stockSymbol);
			System.out.println("Total branches:"+totalBranches);
			System.out.println("Country:"+country);
			System.out.println("Website:"+website);
			System.out.println("Market share:"+marketShare);
			System.out.println("Parent Company:"+parentCompany);
			System.out.println("Total Users:"+totalUsers);
			System.out.println("Rating:"+companyRating);
			System.out.println("Category:"+companyCategory);
			System.out.println("---------------------");
		}
}	   