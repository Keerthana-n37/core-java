class PrinterRunner{
	
	public static void main(String[] values)
	{
		int[] serialNumbers = new int[3];
		serialNumbers[0]= 200;
		serialNumbers[1]= 210;
		serialNumbers[2]= 300;
		
		Ink[] inks = new Ink[3];
		inks[0] = new Ink("Black",200);
		inks[1] = new Ink("Colors",300);
		inks[2] = new Ink("Photo ink",400);
		
		Printer printer = new Printer(serialNumbers,inks);
		printer.displayPrinter();
	}
}