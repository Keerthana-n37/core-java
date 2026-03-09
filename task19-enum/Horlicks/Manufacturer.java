class Manufacturer
{
	String name;
	int establishedYear;
	
	Manufacturer(String name,int establishedYear)
	{
		this.name=name;
		this.establishedYear=establishedYear;
	}
	
	void aboutManufacturer()
	{
		System.out.println("Manfucturer Name:"+this.name);
		System.out.println("Established Year:"+this.establishedYear);
	}
}