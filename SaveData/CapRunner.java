class CapRunner
{
	public static void main(String[] args)
	{
		Cap[] caps=new Cap[10];
		CapStore capStore= new CapStore(caps);
		
		Cap cap1= new Cap("Puma","Black",500,"M","Cotton",true);
		Cap cap2= new Cap("Nike","Blue",650,"L","Polyester",true);
		Cap cap3= new Cap("Adidas","White",550,"M","Cotton",false);
		Cap cap4= new Cap("Adidas","Black",600,"M","Cotton",true);
		Cap cap5= new Cap("Levis","Black",700,"L","Denim",true);
		Cap cap6= new Cap("Levis","Black",700,"M","Cotton",true);
        Cap cap7= new Cap("Fila","Green",350,"S","Cotton",true);
        Cap cap8= new Cap("Zara","Brown",800,"M","Leather",false);
        Cap cap9= new Cap("H&M","Yellow",300,"S","Cotton",true);
        Cap cap10= new Cap("Roadster","Blue",420,"M","Cotton",true);
		
		capStore.saveCap(cap1);
		capStore.saveCap(cap2);
		capStore.saveCap(cap3);
		capStore.saveCap(cap4);
		capStore.saveCap(cap5);
		capStore.saveCap(cap6);
		capStore.saveCap(cap7);
		capStore.saveCap(cap8);
		capStore.saveCap(cap9);
		capStore.saveCap(cap10);		
	}
}