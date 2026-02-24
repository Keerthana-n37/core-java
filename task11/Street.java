class Street {

    static int getPincode(String name)
    {
        System.out.println("Executing getPincode method...");
        System.out.println("Street name: " + name);

        if(name == null)
        {
            System.out.println("Street name cannot be null");
            return 0;
        }

        if(name=="MG Road")
        { 
	       return 560001;
		}
        if(name=="Brigade Road") 
		{
			return 560025;
		}
        if(name=="Church Street")
		{
			return 560001;
		}
        if(name=="Commercial Street") 
		{
			return 560001;
		}
        if(name=="Residency Road") 
		{
			return 560025;
		}
        if(name=="Cunningham Road")
		{
			return 560052;
		}
        if(name=="Lavelle Road")
		{			
			return 560001;
		}
        if(name=="Richmond Road")
		{
			return 560025;
		}
        if(name=="Bannerghatta Road") 
		{
			return 560076;
		}
        if(name=="Jayanagar 4th Block") 
		{
			return 560011;
		}
        if(name=="Indiranagar 100 Feet Road")
		{			
			return 560038;
		}
        if(name=="Koramangala 5th Block")
		{
			return 560095;
		}
        if(name=="HSR Layout Sector 1")
		{			
			return 560102;
		}
        if(name=="Whitefield Main Road") 
		{
			return 560066;
		}
        if(name=="Marathahalli Bridge")
		{			
			return 560037;
		}
        if(name=="Electronic City Phase 1")
		{			
			return 560100;
		}
        if(name=="Rajajinagar 1st Block") 
		{
			return 560010;
		}
        if(name=="Malleshwaram 8th Cross")
		{
			return 560003;
		}
        if(name=="Basavanagudi Bull Temple Road") 
		{
			return 560004;
		}
        if(name=="Yelahanka New Town") 
		{
			return 560064;
		}
        System.out.println("Street not found");
        return 0;
    }


    static String getStreetType(String name)
    {
        System.out.println("Executing getStreetType method...");
        System.out.println("Street name: " + name);

        if(name == null)
        {
            System.out.println("Street name cannot be null");
            return null;
        }

        if(name=="MG Road") 
		{
			return "Commercial Area";
		}
        if(name=="Brigade Road")
		{			
	       return "Shopping Area";
		}
        if(name=="Church Street")
		{
			return "Food & Cafe Area";
		}
        if(name=="Commercial Street")
		{
			return "Market Area";
		}
        if(name=="Residency Road")
		{			
			return "Commercial Area";
		}
        if(name=="Cunningham Road") 
		{
			return "Business Area";
		}
        if(name=="Lavelle Road") 
		{
			return "Premium Commercial";
		}
        if(name=="Richmond Road")
		{
			return "Residential & Commercial";
		}
        if(name=="Bannerghatta Road")
		{
			return "Mixed Development";
		}
        if(name=="Jayanagar 4th Block")
		{			
			return "Residential Area";
		}
        if(name=="Indiranagar 100 Feet Road")
		{			
			return "Shopping & Food Street";
		}
        if(name=="Koramangala 5th Block")
		{			
			return "IT & Cafe Hub";
		}
        if(name=="HSR Layout Sector 1")
		{			
			return "Residential Area";
		}
        if(name=="Whitefield Main Road")
		{			
			return "IT Hub";
		}
        if(name=="Marathahalli Bridge")
		{
			return "Commercial Area";
		}
        if(name=="Electronic City Phase 1") 
		{ 
	        return "IT Hub";
		}
        if(name=="Rajajinagar 1st Block") 
		{
			return "Residential Area";
		}
        if(name=="Malleshwaram 8th Cross")
		{
			return "Traditional Market";
		}
        if(name=="Basavanagudi Bull Temple Road")
		{			
			return "Cultural Area";
		}
        if(name=="Yelahanka New Town")
		{
			return "Residential Area";
		}

        if(name=="Hebbal Ring Road")
		{			
			return "Highway Area";
		}
        if(name=="KR Puram Road") 
		{
			return "Industrial Area";
		}
        if(name=="Vijayanagar 2nd Stage")
		{
			return "Residential Area";
		}
        if(name=="Banashankari 3rd Stage")
		{
			return "Residential Area";
		}
        if(name=="JP Nagar 6th Phase")
		{
			return "Residential Area";
		}
        if(name=="Ulsoor Lake Road") 
		{
			return "Lake Side Area";
		}
        if(name=="Frazer Town Mosque Road")
		{
			return "Market Area";
		}
        if(name=="Shivajinagar Market Road")
		{
			return "Market Area";
		}
        if(name=="Domlur Inner Ring Road") 
		{
			return "Commercial Area";
		}
        if(name=="Nagawara Main Road")
		{
			return "Residential Area";
		}

        if(name=="Peenya Industrial Area")
		{
			return "Industrial Area";
		}
        if(name=="Magadi Road")
		{
			return "Residential Area";
		}
        if(name=="Mysore Road") 
		{
			return "Highway Area";
		}
        if(name=="Tumkur Road")
		{
			return "Highway Area";
		}
        if(name=="Outer Ring Road")
		{
			return "IT Corridor";
		}
        if(name=="Sarjapur Road")
		{
			return "IT & Residential";
		}
        if(name=="Bellandur Main Road")
		{			
			return "IT Hub";
		}
        if(name=="Hennur Road")
		{			
			return "Residential Area";
		}
        if(name=="RT Nagar Main Road")
		{			
			return "Residential Area";
		}
        if(name=="Sadashivanagar 1st Main")
		{
			return "Premium Residential";
		}

        if(name=="Girinagar 2nd Phase")
		{
			return "Residential Area";
		}
        if(name=="Kengeri Satellite Town") 
		{
			return "Residential Area";
		}
        if(name=="Attiguppe Main Road")
		{			
			return "Residential Area";
		}
        if(name=="Chandra Layout 1st Stage")
		{			
			return "Residential Area";
		}
        if(name=="Varthur Road")
		{			
			return "Residential Area";
		}
        if(name=="Kadugodi Main Road")
		{
			return "Residential Area";
		}
        if(name=="Seshadripuram 1st Main")
		{			
			return "Commercial Area";
		}
        if(name=="Wilson Garden 10th Cross")
		{			
		    return "Residential Area";
		}
        if(name=="Shanti Nagar 5th Block") 
		{
			return "Residential Area";
		}
        if(name=="Adugodi Main Road")
		{
			return "Industrial Area";
		}

        if(name=="Bommanahalli Main Road")
		{
			return "Commercial Area";
		}
        if(name=="Kudlu Gate Road")
		{
			return "Industrial Area";
		}
        if(name=="Singasandra Main Road")
		{
			return "Industrial Area";
		}
        if(name=="Hongasandra Road")
		{
			return "Industrial Area";
		}
        if(name=="Begur Road")
		{
			return "Residential Area";
		}
        if(name=="Arekere Gate")
		{
			return "Residential Area";
		}
        if(name=="Gottigere Main Road")
		{
			return "Residential Area";
		}
        if(name=="Anjanapura 2nd Block")
		{
			return "Residential Area";
		}
        if(name=="Hosur Road")
		{
			return "Highway Area";
		}
        if(name=="Old Airport Road")
		{
			return "Commercial Area";
		}

        System.out.println("Street not found");
        return null;
    }
}
