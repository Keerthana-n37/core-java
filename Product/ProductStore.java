class ProductStore
{
	Product[] productArray;
	int currentIndex= 0;
	
	ProductStore(Product[] productArray)
	{
		this.productArray= productArray;
	}
	
	void save(Product product)
	{
		System.out.println("Executing save method in ProductStore...");
		
		if(this.productArray!= null && product!= null)
		{
			int index= this.productArray.length-1;
			
			if(currentIndex <= index)
			{
				this.productArray[this.currentIndex]= product;
				System.out.println("Product saved at index: "+this.currentIndex);
				this.currentIndex++;
			}
			else{
				System.out.println("productArray storage is full");
			}
		}
		else{
			System.out.println("Array or product is null hence cannot to save operation");
		}
	}
	
	void save(Product[] products)
	{
		System.out.println("Executing overloaded save method which takes array of product as input...");
		
		if(products != null && products.length <=10)
		{
			System.out.println("Products is not null hence storing then in array and arraylength<=10 so performing save operation");
			for(Product product: products)
			{
				save(product);
			}
		}else{
			System.out.println("products reference is null or array is greater than 10 hence cannot do save operation");
		}
	}
	
	void displayAllProducts()
	{
		System.out.println("Performing the displayAllProducts in ProductStore");
		for(Product item: this.productArray)
		{
			if(item != null)
			{
				System.out.println("Displaying the details of product: "+item+" using displayAllProducts method");
				item.displayProductInfo();
				System.out.println("-------------------------");
			}
			else{
				System.out.println("Item is null hence cannot perform displayAllProducts");
			}
		}
	}
	
	void checkWarrantyExpiredByUniqueId(int id)
	{
		System.out.println("Executng checkWarrantyExpiredByUniqueId in ProductStore by using id:"+id);
		for(Product product: this.productArray)
		{
			if(product!= null &&  product.uniqueId== id)
			{
				System.out.println("getting warranty expered:"+product.warrantyExpired+ " by uniqueId: "+id);
			}else{
				System.out.println("Product is null or id is not matching");
			}
		}
	}

	
	void search(int productId)
	{
		System.out.println("Executing search method in ProductStore which take input uniqueId");
		
		for(Product item: this.productArray)
		{	
			if(item != null)
			{
				System.out.println("Item is not null so performing search operation");
				if(item.uniqueId == productId)
				{
					System.out.println("Product name is: "+item.productName+" having uniqueId:"+productId);
					item.displayProductInfo();
				}
				else{
					System.out.println("productId is not matching with the uniqueId");
				}
			}else{
				System.out.println("Item is null hence cannot do search operation");
			}
		}
	}
	
	void search(int productId, String name)
	{
		System.out.println("Executing the overloaded search method which take arguments as productId and name");
		System.out.println("Unique id: "+productId+"Name: "+name);
		for(Product product: this.productArray)
		{
			if(product!=null)
			{
				System.out.println("Product is not null hence doing the search operation");
				if(product.uniqueId == productId && product.productName == name)
				{
					System.out.println("Search is successfull and product found");
					System.out.println("Details of product having uniqueId: "+productId+"and name:"+name);
					product.displayProductInfo();
				}
				else{
					System.out.println("Search is not successfull because id and name is not matching");
				}
			}else{
				System.out.println("Product is null cannot do search operation");
			}
		}
	}
	
	
	void search(int id, String name,String country)
	{
		System.out.println("Executing overloaded search method which takes id,name and country as input");
		System.out.println("Unique id: "+id+"Name: "+name+"country:"+country);
		
		for(Product product: this.productArray)
		{
			if(product!= null)
			{
				System.out.println("Product is not null hence searching the product");
				
				if(product.uniqueId== id && product.productName == name && product.originCountry == country)
				{
					System.out.println("Search is successfull and product found");
					System.out.println("Details of product having uniqueId: "+id+" ,name:"+name+"country: "+country);
					product.displayProductInfo();
				}else{
					System.out.println("Search is not successfull because id,name and country is not matching");
				}
			}else{
				System.out.println("Product is null so search operation cannot be performed");
			}
		}
	}
	
	void getAllOriginCountry()
	{
		System.out.println("Executing getAllOriginCountry in ProductStore");
		
		for(Product item: this.productArray)
		{
			if(item!=null)
			{
				System.out.println("Getting country: "+item.originCountry);
			}else{
				System.out.println("Product is null hence cannot get allOriginCountry names");
			}
		}
	}
	
	void getAllByType(ProductType type)
	{
		System.out.println("Executing getAllByType in ProductStore which takes type as input");
		
		for(Product item: this.productArray)
		{
			if(item != null && item.type == type)
			{
				System.out.println("Getting the product details by type:"+type);
				item.displayProductInfo();
			}
			else{
				System.out.println("item or type is null hence cannot get the details");
			}
		}
	}
	
	void getAllByWarrantyYears(ProductWarranty years)
	{
		System.out.println("Executing getAllByWarrantyYears in ProductStore which takes input as years of warranty:"+years);
		for(Product product: this.productArray)
		{
			if(product!=null && product.warrantyYears== years)
			{
				System.out.println("getting all details of product by warrantyYears");
				product.displayProductInfo();
			}
		}
	}
	
}