class PersonRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Multilevel Inheritance Example");

        Manager manager = new Manager();

        manager.name = "Arjun";
        manager.age = 35;
        manager.gender = "Male";

        manager.empId = 501;
        manager.salary = 85000.75;
        manager.company = "TechCorp";

        manager.department = "Development";
        manager.teamSize = 12;
        manager.isSenior = true;

        System.out.println("Person Details");
        manager.displayPersonDetails();

        System.out.println("Employee Details");
        manager.displayEmployeeDetails();
        manager.getSalary();

        System.out.println("Manager Details");
        manager.displayManagerDetails();

        manager.walk();
        manager.eat();
        manager.work();
        manager.manageTeam();
        manager.conductMeeting();
    }
}