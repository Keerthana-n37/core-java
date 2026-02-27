class MuseumCreator
{
	static void getMuseum()
	{
		System.out.println("Create a new Museum");
		Museum museum=new Museum("National Museum");
		System.out.println("Museum name:"+museum.name);
		System.out.println("Museum is created...");
		System.out.println("-----------------");
		System.out.println("Create a another Museum1");
		Museum museum1=new Museum(300);
		System.out.println("Museum ticketPrice:"+museum1.ticketPrice);
		System.out.println("Museum1 is created...");
		System.out.println("-----------------");	
		System.out.println("Create a another Museum2");
		Museum museum2=new Museum("National Museum",300);
		System.out.println("Museum name:"+museum2.name);
		System.out.println("Museum ticketPrice:"+museum2.ticketPrice);
		System.out.println("Museum2 is created...");
		System.out.println("-----------------");
	}
	
	static void getMuseum(String name)
	{
		System.out.println("Create a new Museum with name:"+name);
		Museum museum=new Museum(name);
		System.out.println("Museum name:"+museum.name);
		System.out.println("Museum is created using name has argument");
		System.out.println("-----------------");
	}
	
	static void getMuseum(double ticketPrice)
	{
		System.out.println("Create a new museum with ticketPrice:"+ticketPrice);
		Museum museum=new Museum(ticketPrice);
		System.out.println("Museum ticketPrice:"+museum.ticketPrice);
		System.out.println("Museum is created using ticketPrice has argument");
		System.out.println("-----------------");
	}
	
	static void getMuseum(String name,double ticketPrice)
	{
		System.out.println("Create a new museum with name:"+name+"and ticketPrice:"+ticketPrice);
		Museum museum=new Museum(name,ticketPrice);
		System.out.println("Museum name:"+museum.name);
		System.out.println("Museum ticketPrice:"+museum.ticketPrice);
		System.out.println("Museum is created using name and ticketPrice has argument");
		System.out.println("-----------------");
	}
}