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
	}
	
	void getBattery()
	{
		System.out.println("Battery Capacity:"+this.capacity);
		System.out.println("Battery is rechargeable:"+this.rechargeable);
		System.out.println("Battery brand:"+this.brand);
	}
}