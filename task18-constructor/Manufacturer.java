class Manufacturer{
	String name;
	String country;
	Manufacturer(String name,String country)
	{
		this.name=name;
		this.country=country;
	}
	
	void getManufacturer()
	{
		System.out.println("Manufacturer Name:"+this.name);
		System.out.println("Manufacturer country:"+this.country);
	}
}