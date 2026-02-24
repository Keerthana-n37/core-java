class IntSwitch{
	static void addition()
	{
		int a=15,b=20;
		System.out.println("Sum:"+(a+b));
	}
	static void substraction()
	{
		int result=substract(20,5);
		System.out.println("Result of substraction:"+result);
	}
	static int substract(int a, int b)
	{
		return a-b;
	}
	static void multiplication()
	{
		int a=7,b=6;
		System.out.println("Multiplication:"+a*b);
	}
	static void division()
	{
		int a=45,b=9;
		if(b!=0)
		{
			System.out.println("Division"+(a/b));
		}
		else{
			System.out.println("Cannot divide by zero");
		}
	}
	static void modulus()
	{
		int a=29,b=5;
		int mod=mod(a,b);
		System.out.println("Modulus Result:"+mod);
	}
	static int mod(int a,int b){
		return a%b;
	}
}