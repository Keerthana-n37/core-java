class Profile
{
    String personName;
    int age;
    String emailId;
    String phoneNumber;
    String city;
    boolean working;

    Profile(String personName,int age,String emailId,String phoneNumber,String city,boolean working)
    {
        this.personName= personName;
        this.age= age;
        this.emailId= emailId;
        this.phoneNumber= phoneNumber;
        this.city= city;
        this.working= working;
    }

    void displayProfileDetails()
    {
        System.out.println("Executing displayProfileDetails in Profile");
        System.out.println("Person Name: "+this.personName);
        System.out.println("Age: "+this.age);
        System.out.println("Email Id: "+this.emailId);
        System.out.println("Phone Number: "+this.phoneNumber);
        System.out.println("City: "+this.city);
        System.out.println("Working Status: "+this.working);
        System.out.println("----------------------------");
    }
}