class ProfileRunner
{
	public static void main(String[] args)
	{
		Profile[] profiles= new Profile[10];
		ProfileStore store= new ProfileStore(profiles);
		
		Profile profile1 = new Profile("Ravi",22,"ravi@gmail.com","9876543210","Bangalore",true);
        Profile profile2 = new Profile("Sneha",21,"sneha@gmail.com","9123456780","Mysore",false);
        Profile profile3 = new Profile("Arjun",23,"arjun@gmail.com","9988776655","Hyderabad",true);
        Profile profile4 = new Profile("Divya",20,"divya@gmail.com","9871234560","Davangere",false);
        Profile profile5 = new Profile("Kiran",24,"kiran@gmail.com","9001122334","Mysore",true);
        Profile profile6 = new Profile("Anitha",22,"anita@gmail.com","9887766554","Dharwad",false);
        Profile profile7 = new Profile("Rahul",25,"rahul@gmail.com","9012345678","Bengaluru",true);
        Profile profile8 = new Profile("Megha",21,"megha@gmail.com","9090909090","Mangaluru",false);
        Profile profile9 = new Profile("Suresh",26,"suresh@gmail.com","9345678901","Chennai",true);
        Profile profile10 = new Profile("Nisha",23,"nisha@gmail.com","9456123789","Mumbai",false);

        store.saveProfile(profile1);
        store.saveProfile(profile2);
        store.saveProfile(profile3);
        store.saveProfile(profile4);
        store.saveProfile(profile5);
        store.saveProfile(profile6);
        store.saveProfile(profile7);
        store.saveProfile(profile8);
        store.saveProfile(profile9);
        store.saveProfile(profile10);
	}
}