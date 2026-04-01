class GuitarMusicInstrument extends MusicInstrument
{
	int strings;
	String color;
	
	GuitarMusicInstrument(int strings,String color)
	{
		super("Guitar","String",5000);
		this.strings= strings;
		this.color = color;
		System.out.println("GuitarMusicInstrument constructor is called and takes the default values");
	}
	
	GuitarMusicInstrument(String name, String type,double price,int strings,String color)
	{
		super(name,type,price);
		this.strings=strings;
		this.color=color;
		System.out.println("GuitarMusicInstrument constructor is called and take input as parameter");
	}
	
	GuitarMusicInstrument(String type, double price,int strings,String color)
	{
		super("Guitar",type,price);
		this.strings=strings;
		this.color=color;
		System.out.println("GuitarMusicInstrument constructor takes type and price as input and name as default value");
	}
}