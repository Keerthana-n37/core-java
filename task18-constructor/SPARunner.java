class SPARunner{
	public static void main(String[] args)
	{
		Specialist specialist = new Specialist("Maya Kapoor");
        Guest guest = new Guest("Rohan Mehta");
        Therapy therapy = new Therapy("Swedish Therapy");
        Cabin cabin = new Cabin("Tranquil Cabin");
        ProductKit productKit = new ProductKit("Rose Oil Kit");
		
		SPA spa = new SPA(301, 1999.99, 'X', false, 90,
                specialist, guest, therapy, cabin, productKit);
	}
}