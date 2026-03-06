class Battery{
	int capacity;
	boolean rechargeable;
	String brand;
	
	Battery(int capacity,boolean rechargeable,String brand)
	{
		this.capacity=capacity;
		this.rechargeable=rechargeable;
		this.brand=brand;
		System.out.println("Battery class constructor is executing...");
		System.out.println("Battery Capacity:"+capacity);
		System.out.println("Battery is rechargeable:"+rechargeable);
		System.out.println("Battery brand:"+this.brand);
		System.out.println("--------------------");
	}
}