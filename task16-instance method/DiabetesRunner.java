class DiabetesRunner {

    public static void main(String[] args) 
	{

        Diabetes diabetic1 = new Diabetes(1,"Raj",45,"Male",70.0,5.8,110.0,140.0,6.5,true,
                "2023-01-15","Dr. Sharma","City Hospital","Bengaluru","Karnataka","India",
                true,"Low Carb","Walking",4.5);
        diabetic1.diabetesStatus();

        Diabetes diabetic2 = new Diabetes(2,"Ria",50,"Female",65.0,5.5,120.0,150.0,6.8,false,
                "2022-12-10","Dr. Mehta","Apollo","Mumbai","Maharashtra","India",
                true,"Mediterranean","Yoga",4.3);
        diabetic2.diabetesStatus();

        Diabetes diabetic3 = new Diabetes(3,"Amit",55,"Male",80.0,5.9,130.0,160.0,7.2,true,
                "2021-11-05","Dr. Kapoor","Fortis","Delhi","Delhi","India",
                true,"Low Sugar","Walking",4.6);
        diabetic3.diabetesStatus();

        Diabetes diabetic4 = new Diabetes(4,"Sneha",40,"Female",60.0,5.6,100.0,130.0,6.2,false,
                "2023-02-20","Dr. Jain","Max Hospital","Chennai","Tamil Nadu","India",
                true,"Balanced","Gym",4.2);
        diabetic4.diabetesStatus();

        Diabetes diabetic5 = new Diabetes(5,"Vikram",65,"Male",75.0,5.7,140.0,170.0,7.5,true,
                "2020-10-18","Dr. Gupta","Medanta","Gurgaon","Haryana","India",
                true,"Low Carb","Cycling",4.7);
        diabetic5.diabetesStatus();

        Diabetes diabetic6 = new Diabetes(6,"Ananya",35,"Female",55.0,5.4,95.0,120.0,5.9,false,
                "2023-03-12","Dr. Iyer","Manipal","Bengaluru","Karnataka","India",
                true,"Keto","Walking",4.4);
        diabetic6.diabetesStatus();

        Diabetes diabetic7 = new Diabetes(7,"Rahul",60,"Male",85.0,6.0,150.0,180.0,7.8,true,
                "2019-08-22","Dr. Reddy","Global Hospital","Hyderabad","Telangana","India",
                true,"Low Sugar","Gym",4.8);
        diabetic7.diabetesStatus();

        Diabetes diabetic8 = new Diabetes(8,"Pooja",42,"Female",62.0,5.5,105.0,135.0,6.3,false,
                "2022-06-15","Dr. Verma","Sparsh","Pune","Maharashtra","India",
                true,"Mediterranean","Yoga",4.3);
        diabetic8.diabetesStatus();

        Diabetes diabetic9 = new Diabetes(9,"Karan",50,"Male",78.0,5.9,125.0,155.0,6.9,true,
                "2021-04-10","Dr. Saxena","AIIMS","New Delhi","Delhi","India",
                true,"Balanced","Cycling",4.6);
        diabetic9.diabetesStatus();

        Diabetes diabetic10 = new Diabetes(10,"Isha",38,"Female",58.0,5.5,98.0,128.0,6.0,false,
                "2023-01-25","Dr. Rao","Fortis","Bengaluru","Karnataka","India",
                true,"Low Carb","Walking",4.5);
        diabetic10.diabetesStatus();
    }
}