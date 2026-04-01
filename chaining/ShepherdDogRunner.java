class ShepherdDogRunner 
{
    public static void main(String[] args) 
	{

        ShepherdDog dog1 = new ShepherdDog("Golden Brown", true);
        dog1.displayInfo();

        ShepherdDog dog2 = new ShepherdDog("Rocky", 32.0, 24, "Black", false);
        dog2.displayInfo();

        ShepherdDog dog3 = new ShepherdDog(18,"Dark brown", true, 28.5);
        dog3.displayInfo();
    }
}