class DMart{
	
	int totalProducts;
	Manager storeManager;
	StoreType storeType;
	
	DMart(int totalProducts,Manager storeManager, StoreType storeType)
	{
		this.totalProducts=totalProducts;
		this.storeManager=storeManager;
		this.storeType=storeType;
	}
	
	void printInfo()
	{
		System.out.println("Total Products:"+this.totalProducts);
		
		if(this.storeManager!=null)
		{
			this.storeManager.aboutManager();
		}
		else{
			System.out.println("Manager is null");
		}
		System.out.println("Store Type:"+this.storeType);
		System.out.println("--------------------");
	}
}