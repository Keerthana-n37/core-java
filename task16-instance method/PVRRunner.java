class PVRRunner{
	public static void main(String[] args) 
	{
        PVR pvr1 = new PVR(1,"PVR Forum","MG Road","Bengaluru",
                8,1200,250.0,true, "Ravi","PVR Ltd",4.8,"Premium",
                true,500,"India","Karnataka","Dolby",5000.0,true,"English");
        pvr1.displayPVR();

        PVR pvr2 = new PVR(2,"PVR Orion","Whitefield","Bengaluru",
                6,900,220.0,true,"Anil","PVR Ltd",4.6,"Premium",
                true,400,"India","Karnataka", "Standard",4000.0,true,"English");
        pvr2.displayPVR();

        PVR pvr3 = new PVR(3,"PVR Phoenix","JP Nagar","Bengaluru",
                7,1000,240.0,true,"Suresh","PVR Ltd",4.7,"Premium",
                true,450,"India","Karnataka", "IMAX",4500.0,true,"English");
        pvr3.displayPVR();

        PVR pvr4 = new PVR(4,"PVR Mantri","Malleshwaram","Bengaluru",
                5,800,200.0,false, "Kiran","PVR Ltd",4.4,"Standard",
                false,350,"India","Karnataka", "Standard",3500.0,true,"English");
        pvr4.displayPVR();

        PVR pvr5 = new PVR(5,"PVR Inorbit","Bandra","Mumbai",
                9,1500,300.0,true,"Vikram","PVR Ltd",4.9,"Premium",
                true,600,"India","Maharashtra", "Dolby",6000.0,true,"English");
        pvr5.displayPVR();

        PVR pvr6 = new PVR(6,"PVR Phoenix Mall","Koregaon Park","Pune",
                7,1100,260.0,true,"Raj","PVR Ltd",4.7,"Premium",
                true,500,"India","Maharashtra", "IMAX",5000.0,true,"English");
        pvr6.displayPVR();

        PVR pvr7 = new PVR(7,"PVR Ambience","Vasant Kunj","Delhi",
                8,1300,280.0,true,"Neha","PVR Ltd",4.8,"Premium",
                true,550,"India","Delhi","Dolby",5500.0,true,"English");
        pvr7.displayPVR();

        PVR pvr8 = new PVR(8,"PVR Mall of India","Noida","UP",
                10,2000,320.0,true, "Rohit","PVR Ltd",5.0,"Premium",
                true,700,"India","Uttar Pradesh", "IMAX",7000.0,true,"English");
        pvr8.displayPVR();

        PVR pvr9 = new PVR(9,"PVR Elante","Chandigarh","Punjab",
                6,900,220.0,false,"Amit","PVR Ltd",4.5,"Standard",
                false,400,"India","Punjab", "Standard",4000.0,true,"English");
        pvr9.displayPVR();

        PVR pvr10 = new PVR(10,"PVR VR Mall","Hyderabad","Telangana",
                8,1200,250.0,true, "Manish","PVR Ltd",4.8,"Premium",
                true,500,"India","Telangana","Dolby",5000.0,true,"English");
        pvr10.displayPVR();
    }
}