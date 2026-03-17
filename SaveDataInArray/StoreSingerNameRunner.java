public class StoreSingerNameRunner 
{
    public static void main(String[] args)
	{

        String[] singersArray = new String[20];

        StoreSingerName storeSingerName = new StoreSingerName(singersArray);

        storeSingerName.addSingerName("Arijit Singh");
        storeSingerName.addSingerName("Shreya Ghoshal");
        storeSingerName.addSingerName("Sonu Nigam");
        storeSingerName.addSingerName("Neha Kakkar");
        storeSingerName.addSingerName("Kishore Kumar");
        storeSingerName.addSingerName("Lata Mangeshkar");
        storeSingerName.addSingerName("Udit Narayan");
        storeSingerName.addSingerName("Alka Yagnik");
        storeSingerName.addSingerName("Atif Aslam");
        storeSingerName.addSingerName("Mohit Chauhan");
        storeSingerName.addSingerName("Sunidhi Chauhan");
        storeSingerName.addSingerName("Shaan");
        storeSingerName.addSingerName("Honey Singh");
        storeSingerName.addSingerName("Palak Muchhal");
        storeSingerName.addSingerName("Vishal Dadlani");
        storeSingerName.addSingerName("Shekhar Ravjiani");
        storeSingerName.addSingerName("Armaan Malik");
        storeSingerName.addSingerName("Jonita Gandhi");
        storeSingerName.addSingerName("Amit Trivedi");
        storeSingerName.addSingerName("Neeti Mohan");
		System.out.println("---------------------");
		
		 System.out.println("Search Found");
        boolean found = storeSingerName.searchSingerName("Armaan Malik");
        System.out.println("Result: " + found);
		System.out.println("---------------------");

        System.out.println("Search Not Found");
        boolean notFound = storeSingerName.searchSingerName("A.R. Rahman"); 
        System.out.println("Result: " + notFound);
		System.out.println("---------------------");

        System.out.println("Search Null");
        boolean nullCheck = storeSingerName.searchSingerName(null);
        System.out.println("Result: " + nullCheck);
		System.out.println("---------------------");
		
		System.out.println("UPDATING BY INDEX");
        boolean update=storeSingerName.update(2, "Benny Dayal");
        System.out.println("Result: "+update);
		System.out.println("---------------------");
		
		System.out.println("UPDATING BY NAME");
        update = storeSingerName.update("Neha Kakkar", "Sunidhi Chauhan");
        System.out.println("Result: "+update);
		System.out.println("---------------------");
		
		System.out.println("DELETING BY INDEX");
        String deleteReturn = storeSingerName.delete(1);
        System.out.println("Result:"+deleteReturn);
		System.out.println("---------------------");
		
		System.out.println("DELETING BY NAME");
        deleteReturn= storeSingerName.delete("Kishore Kumar");
        System.out.println("Result:"+deleteReturn);
    }
}