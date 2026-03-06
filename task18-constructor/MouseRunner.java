class MouseRunner{
	
	public static void main(String[] args){
	
	Button button=new Button("Black",true,2.5);
	ScrollWheel scrollWheel=new ScrollWheel("Rubber",true);
	Sensor sensor=new Sensor("Optical",true);
	Wire wire=new Wire(1.5,"Copper",true);
	Battery battery=new Battery(2000,true,"Duracell");
	Mouse mouse = new Mouse(1500.50, true, "Black", "Logitech", 120.5f,
                button, scrollWheel, sensor, wire, battery);
				

	mouse.getMouseInfo();
    }
}