class Brand{
	String brandName;
	int popularityScore;
	
	Brand(String brandName, int popularityScore)
	{
		this.brandName=brandName;
		this.popularityScore=popularityScore;
	}
	
	void aboutBrand()
	{
		System.out.println("Brand Name:"+this.brandName);
		System.out.println("Popularity of that brand:"+this.popularityScore);
	}
}