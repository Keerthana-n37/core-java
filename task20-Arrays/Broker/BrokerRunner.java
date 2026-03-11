class BrokerRunner
{
	public static void main(String[] args)
	{
		float[] commissionRates ={1.5f,2.0f,2.5f};
		
		Client[] clients=new Client[3];
		clients[0] = new Client("Arun", 100000);
		clients[1] = new Client("Balaji", 50000);
		clients[2] = new Client("Chandan", 75000);
		
		Broker broker = new Broker(commissionRates, clients);
		broker.display();
		
	}

}