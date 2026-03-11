class Printer{
	
	int[] serailNumbers;
	Ink[] inks;

    Printer(int[] serailNumbers,Ink[] inks)
	{
		this.serailNumbers=serailNumbers;
		this.inks=inks;
	}

    void displayPrinter()
	{
		System.out.println("Display the information of printer");
		
		if(this.serailNumbers!=null)
		{
			System.out.println("Total serail numbers:"+this.serailNumbers.length);
			for(int number : this.serailNumbers){
				System.out.println("Serial Number:"+number);
			}
		}
		else{
			System.out.println("Serial numbers are empty");
		}
		
		if(this.inks!=null)
		{
			System.out.println("Total ink details:"+this.inks.length);
			for(Ink ink: this.inks)
			{
				System.out.println("Ink type:"+ink.type);
				System.out.println("Price:"+ink.price);
			}
		}
		else{
			System.out.println("Ink details are empty");
		}
	}
    	
}