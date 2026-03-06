class Zoo{
	String zooName;
	String city;
	Zoo(String zooName,String city)
	{
		this.zooName=zooName;
		this.city=city;
	}
	
	void getZoo()
	{
		System.out.println("Zoo Name: " + this.zooName);
        System.out.println("Zoo City: " +this.city);
	}
}