class Runner{
	public static void main(String[] args)
	{
		System.out.println("Museum Details...");
		MuseumCreator.getMuseum();
		MuseumCreator.getMuseum("City Museum");
		MuseumCreator.getMuseum(250);
		MuseumCreator.getMuseum("History Museum",300);
		
		System.out.println("ZOO Details...");
		ZooCreator.getZoo();
		ZooCreator.getZoo("National Zoo");
		ZooCreator.getZoo(180);
		ZooCreator.getZoo("City Zoo",220);
		
		System.out.println("Stadium Details...");
		StadiumCreator.getStadium();
		StadiumCreator.getStadium("Eden Gardens");
		StadiumCreator.getStadium(50000);
		StadiumCreator.getStadium("Olympic Stadium",75000);
	}
}