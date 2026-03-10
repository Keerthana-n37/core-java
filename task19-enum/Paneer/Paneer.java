class Paneer{
	int weightInGrams;
	PaneerAttributes attributes;
	PaneerShape shape;
	
	Paneer(int weightInGrams,PaneerAttributes attributes,PaneerShape shape)
	{
		this.weightInGrams=weightInGrams;
		this.attributes=attributes;
		this.shape=shape;
	}
	
	void printInfo()
	{
		System.out.println("Weight:"+this.weightInGrams);
		
		if(this.attributes!=null)
		{
			this.attributes.showAttributes();
		}
		else{
			System.out.println("Attribute is null");
		}
		
		System.out.println("Paneer shape:"+this.shape);
		System.out.println("------------------");
	}
}