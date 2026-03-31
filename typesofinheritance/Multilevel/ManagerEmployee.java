class ManagerEmployee extends Employee 
{
    String department;
    int teamSize;
    boolean isSenior;

    Manager()
	{
        super();
        System.out.println("Manager constructor called");
    }

    void manageTeam()
	{
        System.out.println("Manager is managing team");
    }

    void conductMeeting()
	{
        System.out.println("Manager is conducting meeting");
    }

    void displayManagerDetails() 
	{
        System.out.println("Department of manager: "+department);
        System.out.println("Team size: "+teamSize);
        System.out.println("Is senior manager: "+isSenior);
    }
}