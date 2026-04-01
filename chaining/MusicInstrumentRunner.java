class MusicInstrumentRunner
{
	public static void main(String[] args)
	{
		GuitarMusicInstrument guitar1= new GuitarMusicInstrument(6,"Black");
		System.out.println("Name of instrument:"+guitar1.name);
		System.out.println("Type of instrument:"+guitar1.type);
		System.out.println("Price of instrument:"+guitar1.price);
		System.out.println("Number of strings in guitar: "+guitar1.strings);
		System.out.println("color of guitar: "+guitar1.color);
		System.out.println("------------------");
		
		GuitarMusicInstrument guitar2= new GuitarMusicInstrument("Guitar", "Acoustic", 7000,6, "Brown");
		System.out.println("Name of instrument:"+guitar2.name);
		System.out.println("Type of instrument:"+guitar2.type);
		System.out.println("Price of instrument:"+guitar2.price);
		System.out.println("Number of strings in guitar: "+guitar2.strings);
		System.out.println("color of guitar: "+guitar2.color);
		System.out.println("------------------");
		
		GuitarMusicInstrument guitar3= new GuitarMusicInstrument("Electric",15000,6 ,"Red");
		System.out.println("Name of instrument:"+guitar3.name);
		System.out.println("Type of instrument:"+guitar3.type);
		System.out.println("Price of instrument:"+guitar3.price);
		System.out.println("Number of strings in guitar: "+guitar3.strings);
		System.out.println("color of guitar: "+guitar3.color);
		System.out.println("------------------");
	}
}