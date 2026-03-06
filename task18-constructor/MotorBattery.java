class MotorBattery{
	
	int capacity;
	String type;
	
	MotorBattery(int capacity,String type)
	{
		this.capacity=capacity;
		this.type=type;
	}
	
	void getMotorBattery()
	{
		System.out.println("Battery Capacity:"+this.capacity);
		System.out.println("Battery type:"+this.type);
	}
}