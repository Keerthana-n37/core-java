class InstrumentRunner 
{
    public static void main(String[] args) 
	{

        System.out.println("Subclass Object Same Type");

        ElectricInstrument instrument = new ElectricInstrument();
        instrument .instrumentName = "Guitar";
        instrument .type = "String";
        instrument .price = 15000;
        instrument .portable = true;
        instrument .brand = "Yamaha";
        instrument.power = 220;
        instrument.amplifier = true;
        instrument.strings = 6;
        instrument.soundType = "Electric";

        System.out.println(instrument.instrumentName);
        System.out.println(instrument.type);
        System.out.println(instrument.price);
        System.out.println(instrument.portable);
        System.out.println(instrument.brand);
        System.out.println(instrument.power);
        System.out.println(instrument.amplifier);
        System.out.println(instrument.strings);
        System.out.println(instrument.soundType);

        instrument.play();
        instrument.stop();
        instrument.connectPower();
        instrument.adjustSound();


        System.out.println("Parent Reference Subclass Object");

        Instrument instrument1 = new ElectricInstrument();
        instrument1.instrumentName = "Keyboard";
        instrument1.type = "Digital";
        instrument1.price = 12000;
        instrument1.portable = true;

        System.out.println(instrument1.instrumentName);
        System.out.println(instrument1.type);
        System.out.println(instrument1.price);
        System.out.println(instrument1.portable);

        instrument1.play();
        instrument1.stop();


        System.out.println("Parent Class Object");

        Instrument instrument2 = new Instrument();
        instrument2.instrumentName = "Flute";
       instrument2.type = "Wind";
        instrument2.price = 2000;
        instrument2.portable = true;

        System.out.println(instrument2.instrumentName);
        System.out.println(instrument2.type);
        System.out.println(instrument2.price);
        System.out.println(instrument2.portable);

        instrument2.play();
        instrument2.stop();
    }
}