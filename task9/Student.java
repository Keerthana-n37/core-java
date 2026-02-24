class Student{
	static void details(String name,int age,String branch){
		System.out.println("Executing the deatils method of student which take parameter like name,age,course...");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Branch:"+branch);
		if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(age<=0){
			System.out.println("This is invalid data age should be greater than zero");
			return;
		}
		if(branch==null){
			System.out.println("This is invalid data branch cannot be null");
			return;
		}
		System.out.println("This is valid data");
		System.out.println("-----------------------");
	}
	
	static void details(String name,int age){
	    System.out.println("Executing the overloaded deatils method of student which take parameter like name,age....");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
		if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(age<=0){
			System.out.println("This is invalid data age should be greater than zero");
			return;
		}
		
		System.out.println("This is valid data");
		System.out.println("-----------------------");
	}
	
	static void details(String name,int age,String college,String city){
		 System.out.println("Executing the overloaded deatils method of student which take parameter like name,age,college,city....");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("College:"+college);
		System.out.println("City:"+city);
		if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(age<=0){
			System.out.println("This is invalid data age should be greater than zero");
			return;
		}
		if(college==null){
			System.out.println("This is invalid data college cannot be null");
			return;
		}
		if(city==null){
			System.out.println("This is invalid data city name cannot be null");
			return;
		}
		System.out.println("This is valid data");
		System.out.println("-----------------------");
	}
}