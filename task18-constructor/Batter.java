class Batter {
    String batterName;
	
    Batter(String batterName) {
        System.out.println("Executing Batter Constructor");
        this.batterName = batterName;
    }
	
	void getBatter()
	{
		System.out.println("Batter name:"+this.batterName);
	}
	
}