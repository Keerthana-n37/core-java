class Broker
{
	float[] commissionRates;
	Client[] clients;
	
	Broker(float[] commissionRates, Client[] clients)
	{
		this.commissionRates= commissionRates;
		this.clients = clients;
	}
	
	void display()
	{
		System.out.println("Broker Information:");
		
		if(this.commissionRates!=null)
		{
			System.out.println("Total commission rate:"+this.commissionRates.length);
			for(float rate: commissionRates)
			{
				System.out.println("Commission Rate:"+rate);
			}
		}
		else{
			System.out.println("Commission rates array is empty");
		}
		
		if(this.clients!=null)
		{
			System.out.println("Total clients:"+this.clients.length);
			for(Client client : clients)
			{
				System.out.println("Client name:"+client.name);
				System.out.println("Client Investment:"+client.investment);
			}
		}
		else{
			System.out.println("Client array is empty");
		}
	}
}