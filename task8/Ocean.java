class Ocean {
	
    static void oceanInfo(String name, double area, double depth, String location, boolean isSaline) {
        System.out.println("Ocean Name: " + name);
        System.out.println("Area: " + area + " sq km");
        System.out.println("Depth: " + depth + " meters");
        System.out.println("Location: " + location);
        System.out.println("Is Saline: " + isSaline);
        System.out.println("-----------------------------");
		if(name==null){
			System.out.println("This is a invalid ocean name");
			return;
		}
		if(depth<=0.0){
			System.out.println("This is invalid depth");
			return;
		}
		if(location==null)
		{
			System.out.println("This is invalid location name");
			return;
		} 
		System.out.println("this is valid data");
}
	
}