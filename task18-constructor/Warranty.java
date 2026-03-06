class Warranty{
	int years;
	String provider;
	
	Warranty(int years,String provider)
	{
		this.years=years;
		this.provider=provider;
	}
	
	
	void getWarranty()
	{
		System.out.println("Years of warranty:"+this.years);
		System.out.println("Warranty provider:"+this.provider);
	}
}