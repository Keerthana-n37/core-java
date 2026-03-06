class Habitat{
	String location;
	String climate;
	Habitat(String location,String climate)
	{
		this.location=location;
		this.climate=climate;
	}
	
	void getHabitat()
	{
		System.out.println("Habitat Location: " + this.location);
        System.out.println("Habitat Climate: " + this.climate);
	}
}