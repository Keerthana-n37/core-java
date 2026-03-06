class Sensor{
	String sensorType;
	boolean active;
	Sensor(String sensorType,boolean active)
	{
		this.sensorType=sensorType;
		this.active=active;
		System.out.println("Sensor class is executing...");
		System.out.println("Sensortype:"+sensorType);
		System.out.println("Sensor is active:"+active);
		System.out.println("--------------------");
	}
}