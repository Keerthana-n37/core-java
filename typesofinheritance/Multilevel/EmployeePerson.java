class EmployeePerson extends Person 
{
    int employeeId;
    double salary;
    String company;

    Employee() 
	{
        super();
        System.out.println("Employee constructor called");
    }

    void work()
	{
        System.out.println("Employee is working");
    }

    void getSalary()
	{
        System.out.println("Salary: " +salary);
    }

    void displayEmployeeDetails() 
	{
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Company of employee: "+company);
    }
}