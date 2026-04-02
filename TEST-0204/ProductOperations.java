class ProductOperations
{

    Product[] productArray;
	int currentIndex= 0;
	
	ProductOperations(Product[] productArray)
	{
		this.productArray= productArray;
	}
	
	void addProduct(Product product)
	{
		System.out.println("Executing addProduct method in ProductOperations...");
		
		if(this.productArray!= null && product!= null)
		{
			int index= this.productArray.length-1;
			
			if(currentIndex <= index)
			{
				this.productArray[this.currentIndex]= product;
				System.out.println("Product added at index: "+this.currentIndex);
				this.currentIndex++;
				product.display();
			}
			else{
				System.out.println("productArray storage is full");
			}
		}
		else{
			System.out.println("Array or product is null hence cannot to save operation");
		}
	}
	
	void displayAll()
	{
		System.out.println("Display the details of all products...");

		for(Product product : this.productArray)
		{
			if(product != null)
			{
				product.display();
			}
		}
	}
	
	void getProductDetails(int productId)
	{
		System.out.println("Executing getProductDetails method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product!= null &&  product.productId== productId)
			{
				System.out.println("getting the product details by productId:"+productId);
				product.display();
				break;
			}else{
				System.out.println("Product is null or id is not matching");
			}
		}
	}
	
	void getProductPrice(String name)
	{
		System.out.println("Executing getProductPrice method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product!= null && product.productName == name)
			{
				System.out.println("getting product price by productName "+name);
				System.out.println("Product name: "+name+" product price: " +product.price);
				break;
			}
			else{
				System.out.println("Product is null or name is not matching");
			}
		}
	}
	
	
	void getProductName(String companyName)
	{
		System.out.println("Executing getProductName method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product != null && product.productCompanyName == companyName)
			{
				System.out.println("getting product name by companyName: "+companyName);
				System.out.println("Product name: "+product.productName+ "companyName: "+companyName);
				break;
			}
			else{
				System.out.println("Product is null or companyName is not matching");
			}
			
		}
	}
	
	boolean getCompanyName(String name)
	{
		System.out.println("Executing getCompanyName method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product !=null && product.productName == name)
			{
				System.out.println("Getting companyName by productName: "+name);
				System.out.println("Company name: "+product.productCompanyName);
				return true;
			}else{
				System.out.println("Array is null or product name is not matching");
			}
		}
		return false;
	}
	
	void getManufactureAndExpireDate(String name)
	{
		System.out.println("Executing getManufactureAndExpireDate method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product !=null && product.productName == name)
			{
				System.out.println("Getting manufacture and expiry date by productName:"+name);
				System.out.println("Manufacture date: "+product.manufactureDate+" Expiry date: "+product.expireDate);
				break;
			}
			else{
				System.out.println("Product is null or name is null cannot getManufactureAndExpireDate");
			}
		}
	}
	
	boolean updateManufactureAndExpiryDate(String name,String manufactureDate, String expireDate)
	{
		System.out.println("Executing updateManufactureAndExpiryDate method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product != null && product.productName == name)
			{
				product.manufactureDate= manufactureDate;
				product.expireDate = expireDate;
				System.out.println("Updated date are...");
				System.out.println("Manufacture date: "+product.manufactureDate+" Expire date: "+product.expireDate);
				return true;
			}
			else{
				System.out.println("Cannot do update name is not matching");
			}
		}
		return false;
	}
	
	
	double updatePrice(String name,double price)
	{
		for(Product product: this.productArray)
		{
			if(product != null && product.productName == name)
			{
				product.price= price;
				System.out.println("Updated price is:"+product.price);
				return price;
			}
			else{
				System.out.println("Cannot do update name is not matching");
			}
		}
		return 0.0;
	}
	
	void getProductName(ProductType type)
	{
		System.out.println("Executing getProductName method in ProductOperations");
		
		for(Product product: this.productArray)
		{
			if(product != null && product.type == type)
			{
				System.out.println("getting product name by type: "+type);
				System.out.println("Product name: "+product.productName+ "Product type: "+type);
				break;
			}
			else{
				System.out.println("Product is null or type is not matching");
			}
			
		}
	}
	
	boolean deleteProduct(String name)
	{
		for (int index = 0; index < productArray.length; index++)
		{
			Product product = productArray[index];

			if (product != null && product.productName.equals(name))
			{
				System.out.println("Deleting Product:");
				productArray[index] = null; 
                System.out.println("Deleting product at index:"+index);			
				System.out.println("Deleted product details:");
				product.display();
				return true;
			}
		}
        System.out.println("product is null or name is not matching cannot do delete operation");
		return true;
      
	 }
	
    void getManufactureDate(String name)
	{
		System.out.println("Executing getManufactureDate by ProductOperations");
		{
			for(Product product: this.productArray)
			{
				if(product!=null && product.productName== name)
				{
					System.out.println("getting manufactureDate:"+product.manufactureDate);
					break;
				}else{
					System.out.println("product is null or name is not matching");
				}
			}
		}
	}
	
	void getExpireDate(String name)
	{
		System.out.println("Executing getExpireDate by ProductOperations");
		{
			for(Product product: this.productArray)
			{
				if(product!=null && product.productName== name)
				{
					System.out.println("getting manufactureDate:"+product.expireDate);
					break;
				}else{
					System.out.println("product is null or name is not matching");
				}
			}
		}
	}
}