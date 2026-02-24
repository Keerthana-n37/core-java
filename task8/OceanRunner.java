class OceanRunner{ 
public static void main(String[] args)
{      
		System.out.println("This is Oceaninfo1:");

		String name="Pacific";
		double area=168723000;
		double depth=3970;
		String location="Between Asia and America";
		boolean isSaline=true;
		Ocean.oceanInfo(name,area,depth,location,isSaline);
		
        System.out.println("This ia OceanInfo2:");
		name="Atlantic";
		area=85133000;
		depth=3646;
		location="Between Americas and Europe/Africa";
		isSaline=true;
		Ocean.oceanInfo(name,area,depth,location,isSaline);
		
		System.out.println("This ia OceanInfo3:");
		name="Indian";
		area=70560000;
		depth=3741;
		location="Between Africa, Asia and Australia";
		isSaline=true;
		Ocean.oceanInfo(name,area,depth,location,isSaline);
 }}