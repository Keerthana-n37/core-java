class Temperature{

    public static void main(String[] args) {
        startMonitoring();
    }

    static void startMonitoring() {
        int temp = getTemperature();
        checkTemperature(temp);
        readingSensor();
        monitoringCycle();
        alertCheck();
    }

    static void checkTemperature(int temp) {

        if (isHot(temp)){			
			print("High Temperature");
		}

        if (temp<10) 
		{ 
	       print("Cold");
		}
        else{ print("Normal");}

        if (temp>40)
		{			
	       print("Extreme Heat");
		}
        else if (temp>30) 
		{  print("Warm");
		}
        else 
		{
			print("Cool");
		}

        if (isHot(temp)) {
            if (temp > 45){ 
			print("Danger Level");}
        }
    }

    static void readingSensor() {
        for (int i = 1; i <= 3; i++)
            print("Reading Sensor " + i);
    }

    static void monitoringCycle() {
        int i = 1;
        while (i <= 2) {
            print("Monitoring Cycle " + i);
            i++;
        }
    }

    static void alertCheck()) {
        int i = 1;
        do {
            print("Alert Check " + i);
            i++;
        } while (i <= 2);
    }

    static int getTemperature() 
	{ 
	      return 38; 
    }
    static boolean isHot(int t) 
	{  
	       if(t > 35){
			   System.out.println("Temperature:"+t);
		       return true;
		   }
           else{return false;}		   
    }
    static void print(String msg) 
	{ 
	   System.out.println(msg);
	}
}
