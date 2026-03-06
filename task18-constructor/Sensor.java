class Sensor{
	String sensorType;
	boolean active;
	Sensor(String sensorType,boolean active)
	{
		this.sensorType=sensorType;
		this.active=active;
		System.out.println("Sensor class is executing...");
		
	}
	
	void getSensor()
	{
		System.out.println("Sensortype:"+this.sensorType);
		System.out.println("Sensor is active:"+this.active);
	}
}