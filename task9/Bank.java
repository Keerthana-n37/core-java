class Bank {

    static void account(String name, String type) {
		System.out.println("Executing account method takes parameter like name,type");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
		if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(type==null){
			System.out.println("This is invalid data type cannot be null");
			return;
		}
		System.out.println("Data is valid");
		System.out.println("--------------------");
    }

    static void account(String name, String type, double balance) {
		System.out.println("Executing the overloaded account method takes parameter like name,type,balance");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
		if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(type==null){
			System.out.println("This is invalid data type cannot be null");
			return;
		}
		if(balance<=0){
			System.out.println("This is invalid data balance cannot be zero");
			return;
		}
		System.out.println("Data is valid");
		System.out.println("--------------------");
    }

    static void account(String name, String type, double balance, String branch) {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println("Branch: " + branch);
        if(name==null){
			System.out.println("This is invalid data name cannot be null");
			return;
		}
		if(type==null){
			System.out.println("This is invalid data type cannot be null");
			return;
		}
		if(balance<=0){
			System.out.println("This is invalid data balance cannot be zero");
			return;
		}
		if(branch==null){
			System.out.println("This is invalid data branch must exists");
			return;
		}
		System.out.println("Data is valid");
		System.out.println("--------------------");
    }
}
