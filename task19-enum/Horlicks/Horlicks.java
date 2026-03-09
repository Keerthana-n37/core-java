class Horlicks{
	int quantity;
	Manufacturer manufacturer;
	Flavor flavor;
	
	
	Horlicks(int quantity,Manufacturer manufacturer,Flavor flavor)
	{
		this.quantity=quantity;
		this.manufacturer=manufacturer;
		this.flavor=flavor;
	}
	
	void printInfo()
	{
		System.out.println("Quantity:"+this.quantity);
		
		if(manufacturer!=null)
		{
			this.manufacturer.aboutManufacturer();
		}
		else{
			System.out.println("Manufacturer is null");
		}
		System.out.println("Flacor:"+this.flavor);
		System.out.println("---------------------");
	}
}