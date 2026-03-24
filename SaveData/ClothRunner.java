class ClothRunner
{
	public static void main(String[] args)
	{
		Cloth[] clothes= new Cloth[10];
		ClothStore store= new ClothStore(clothes);
		
		Cloth cloth1= new Cloth("T-Shirt","Black","Cotton","M",500,true);
		Cloth cloth2= new Cloth("Jeans","Blue","Denim","L",1200,true);
        Cloth cloth3= new Cloth("Shirt","White","Cotton","M",800,true);
        Cloth cloth4= new Cloth("Jacket","Brown","Leather","L",2500,false);
        Cloth cloth5= new Cloth("Kurta","Yellow","Silk","M",1500,true);
        Cloth cloth6= new Cloth("Sweater","Grey","Wool","L",1800,true);
        Cloth cloth7= new Cloth("Shorts","Green","Cotton","S",400,true);
        Cloth cloth8= new Cloth("Blazer","Black","Polyester","L",3000,false);
        Cloth cloth9= new Cloth("Hoodie","Red","Fleece","M",1600,true);
        Cloth cloth10= new Cloth("TrackPant","Blue","Cotton","M",900,true);

        store.saveCloth(cloth1);
        store.saveCloth(cloth2);
        store.saveCloth(cloth3);
        store.saveCloth(cloth4);
        store.saveCloth(cloth5);
        store.saveCloth(cloth6);
        store.saveCloth(cloth7);
        store.saveCloth(cloth8);
        store.saveCloth(cloth9);
        store.saveCloth(cloth10);
	}
}