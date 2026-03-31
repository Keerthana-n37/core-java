class SlideRunner 
{
    public static void main(String[] args)
	{

        System.out.println("Subclass Object Same Type");

        WaterSlide slide = new WaterSlide();
        slide.slideName = "AquaFun";
        slide.material = "Fiber";
        slide.height = 30;
        slide.safe = true;
        slide.waterFlow = true;
        slide.speedLevel = 5;
        slide.color = "Blue";
        slide.curved = true;
        slide.capacity = 20;

        System.out.println(slide.slideName);
        System.out.println(slide.material);
        System.out.println(slide.height);
        System.out.println(slide.safe);
        System.out.println(slide.waterFlow);
        System.out.println(slide.speedLevel);
        System.out.println(slide.color);
        System.out.println(slide.curved);
        System.out.println(slide.capacity);

        slide.startSliding();
        slide.stopSliding();
        slide.splashWater();
        slide.increaseSpeed();


        System.out.println("Parent Reference Subclass Object");

        Slide slide1 = new WaterSlide();
        slide1.slideName = "KidsSlide";
        slide1.material = "Plastic";
        slide1.height = 15;
        slide1.safe = true;

        System.out.println(slide1.slideName);
        System.out.println(slide1.material);
        System.out.println(slide1.height);
        System.out.println(slide1.safe);

        slide1.startSliding();
        slide1.stopSliding();


        System.out.println("Parent Class Object");

        Slide normalSlide = new Slide();
        normalSlide.slideName = "ParkSlide";
        normalSlide.material = "Metal";
        normalSlide.height = 10;
        normalSlide.safe = true;

        System.out.println(normalSlide.slideName);
        System.out.println(normalSlide.material);
        System.out.println(normalSlide.height);
        System.out.println(normalSlide.safe);

        normalSlide.startSliding();
        normalSlide.stopSliding();
    }
}