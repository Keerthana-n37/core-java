class NapkinRunner{
	
	public static void main(String[] args)
	{
		Brand brand1= new Brand("SoftTouch",90);
		Material material1=Material.PAPER;
		Napkin napkin1=new Napkin(50,brand1,material1);
		napkin1.printInfo();
		
		Brand brand2 = new Brand("EcoCloth", 85);
        Napkin napkin2 = new Napkin(60, brand2, Material.CLOTH);
        napkin2.printInfo();

        Brand brand3 = new Brand("BambooCare", 80);
        Material material2 = Material.BAMBOO;
        Napkin napkin3 = new Napkin(40, brand3, material2);
        napkin3.printInfo();

        Brand brand4 = new Brand("MicroSoft", 95);
        Napkin napkin4 = new Napkin(70, brand4, Material.MICROFIBER);
        napkin4.printInfo();
	}
}