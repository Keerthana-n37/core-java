class ServerRunner 
{
    public static void main(String[] args) 
	{
        Status[] statuses = new Status[3];
        statuses[0] = new Status("Running",true);
        statuses[1] = new Status("Stopped",false);
        statuses[2] = new Status("Maintenance",true);

        IPAddress[] ipAddresses = new IPAddress[3];
        ipAddresses[0] = new IPAddress("192.168.1.1","255.255.255.0");
        ipAddresses[1] = new IPAddress("192.168.1.2","255.255.255.0");
        ipAddresses[2] = new IPAddress("192.168.1.3","255.255.255.0");

        Server server = new Server(statuses,ipAddresses);
        server.display();
    }
}