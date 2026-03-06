class Controller {
	
    String model;
    int version;

    Controller(String model, int version) {
        this.model = model;
        this.version = version;
    }
	
	void getController()
	{
		System.out.println("Controller model:"+this.model);
		System.out.println("Controller Version:"+this.version);
	}
}