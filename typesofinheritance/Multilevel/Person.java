class Person 
{
    String name;
    int age;
    String gender;

    Person() 
	{
        System.out.println("Person constructor called");
    }

    void walk() 
	{
        System.out.println("Person is walking");
    }

    void eat() 
	{
        System.out.println("Person is eating");
    }

    void displayPersonDetails()
	{
        System.out.println("Name of person: "+name);
        System.out.println("Age of the person: "+age);
        System.out.println("Gender of person: "+gender);
    }
}