class Runner{
	
	public static void main(String[] args){
	
	Button button=new Button("Black",true,2.5);
	ScrollWheel scrollWheel=new ScrollWheel("Rubber",true);
	Sensor sensor=new Sensor("Optical",true);
	Wire wire=new Wire(1.5,"Copper",true);
	Battery battery=new Battery(2000,true,"Duracell");
	Mouse mouse = new Mouse(1500.50, true, "Black", "Logitech", 120.5f,
                button, scrollWheel, sensor, wire, battery);
				
	Folder folder=new Folder("Projects","D:/Projects");
	Owner owner=new Owner("Anu","anu@gmail.com");
	Drive drive= new Drive("D",500);
	Permission permission=new Permission("Read and write",true);
	Backup backup=new Backup(true,"Cloud");
	
	File file=new File("Assignment","PDF",2.5,05032026,"D:/Projects/Assignment.pdf",folder,owner,drive,permission,backup);

    Habitat habitat = new Habitat("Savannah", "Hot");
    Diet diet = new Diet("Meat", 3);
    Zoo zoo = new Zoo("Bannerghatta Zoo", "Bangalore");
    Trainer trainer = new Trainer("Ravi", 10);
    Health health = new Health(true, "01-03-2026");

    Lion lion = new Lion("Simba", 5, 190.5, "Male", true,
                             habitat, diet, zoo, trainer, health);

    lion.display();
	
	Manufacturer manufacturer = new Manufacturer("Bosch", "Germany");
    MotorBattery motorbattery = new MotorBattery(5000, "Lithium-Ion");
    Controller controller = new Controller("CTRL-X", 2);
    CoolingSystem cooling = new CoolingSystem("Air Cooling", "High");
    Warranty warranty = new Warranty(3, "Bosch Service");

    Motor motor = new Motor("XMotor", 1500, 220.5, "Electric", true,
                                manufacturer, motorbattery, controller, cooling, warranty);
    motor.display();
    }
}