class Server
{
	Status[] statuses;
	IPAddress[] ipAddresses;
	
	Server(Status[] statuses, IPAddress[] ipAddresses)
	{
		this.statuses=statuses;
		this.ipAddresses=ipAddresses;
	}
	
	void display()
	{
		System.out.println("Server Information");
		
		if(this.statuses!= null)
		{
			System.out.println("Total statuses:"+this.statuses.length);
			for(Status status: statuses)
			{
				System.out.println("State:"+status.state);
				System.out.println("Active:"+status.active);
			}
		}else{
			System.out.println("Statuses are empty");
		}
		
		if(this.ipAddresses!=null)
		{
			System.out.println("Total ipAdresses:"+this.ipAddresses.length);
			for(IPAddress ip: ipAddresses)
			{
				System.out.println("IP Address:"+ip.ip);
				System.out.println("Subnet:"+ip.subnet);
			}
		}else{
			System.out.println("IP Addresses are empty");
		}
	}
}