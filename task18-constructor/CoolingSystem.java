class CoolingSystem{
	
    String method;
    String efficiency;

    CoolingSystem(String method, String efficiency) {
        this.method = method;
        this.efficiency = efficiency;
    }
	
	void getCoolingSystem()
	{
		System.out.println("Cooling method:"+this.method);
		System.out.println("Cooling efficiency:"+this.efficiency);
	}
}