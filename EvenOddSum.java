class EvenOddSum{
	public static void main(String[] args)
	{
		int[] array={1,2,3,4,5,6};
		int evenSum=0;
		int oddSum=0;
		for(int index=0;index<array.length;index++)
		{
			if(array[index]%2==0)
			{
				evenSum+=array[index];
			}
			else{
				oddSum+=array[index];
			}
		}
		System.out.println("Even Sum:"+evenSum);
		System.out.println("Odd Sum:"+oddSum);
	}
}