class BiscuitRunner
{  
    public static void main(String[] args)
	{
		String name="DARK FANTASY";
		
		double cost=Biscuit.getCost(name);
		System.out.println("Cost of the biscuit is:"+cost);
		
		String shape=Biscuit.getShape(name);
		System.out.println("Shape of biscuit is:"+shape);
		
		shape=Biscuit.getShape("OREO");
		System.out.println("Shape of the biscuit is:"+shape);
		
		String[] flavours =Biscuit.getFlavours(name);

        if (flavours != null) 
		{
           System.out.println("Flavours of "+name+":");
           for (int i = 0; i < flavours.length; i++) 
		   {
              System.out.println(flavours[i]);
           }
	    }
    }
}