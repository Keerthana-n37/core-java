class Swap
{
	static void swap(int a,int b)
	{
		System.out.println("Before Swap");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swap");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
}