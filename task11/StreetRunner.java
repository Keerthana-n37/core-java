class StreetRunner
{
	public static void main(String[] args)
	{    
	    String name="MG Road";
		int pincode=Street.getPincode(name);
		System.out.println("Pincode of "+name+"is:"+pincode);
		String type=Street.getStreetType(name);
		System.out.println("Street type of"+name+"is:"+type);
		
		name="Commercial Street";
		pincode=Street.getPincode(name);
		System.out.println("Pincode of "+name+"is:"+pincode);
		type=Street.getStreetType(name);
		System.out.println("Street type of"+name+"is:"+type);
	}
}