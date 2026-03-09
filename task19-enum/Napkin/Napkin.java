class Napkin{
	int sheetPerPack;
	Brand brand;
	Material material;
	
	Napkin(int sheetPerPack,Brand brand,Material material)
	{
		this.sheetPerPack=sheetPerPack;
		this.brand=brand;
		this.material=material;
	}
	
	void printInfo()
	{
		System.out.println("Sheets per pack:"+this.sheetPerPack);
		
		if(this.brand!=null)
		{
			this.brand.aboutBrand();
		}
		else{
			System.out.println("Brand is null");
		}
		
		System.out.println("Material:"+this.material);
		System.out.println("--------------------");
	}
}