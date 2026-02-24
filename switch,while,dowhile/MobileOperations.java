class MobileOperations {
    public static void main(String[] args) {
        int battery =100;
		int charge=0;
        while (battery > 60) {
            Mobile.makeCall("Samsung Galaxy");
            battery=battery-20;
        }
		while(battery<=10){
			Mobile.chargePhone("Samsung Galaxy");
		}

        do {
            Mobile.chargePhone("Samsung Galaxy");
            charge+=30;
        } while (charge < 60);
		do{
			Mobile.makeCall("Samsung Galaxy");
			battery-=10;
		}while(battery>=60)
		
    }
}
