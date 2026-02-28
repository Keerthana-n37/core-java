class DumbBellRunner {

    public static void main(String[] args) {

        DumbBell dumbBell1 = new DumbBell(1,"Bowflex",10.0,12.0,"Steel","Black",true,20,5,true,
                "Adjustable",2500.0,"Fitness","Gym","Home",true,24,4.8,"USA",true);
        dumbBell1.dumbBellDetails();

        DumbBell dumbBell2 = new DumbBell(2,"PowerBlock",8.0,10.0,"Iron","Gray",true,15,5,true,
                "Adjustable",2200.0,"Fitness","Home","Gym",true,12,4.7,"USA",true);
        dumbBell2.dumbBellDetails();

        DumbBell dumbBell3 = new DumbBell(3,"AmazonBasics",5.0,8.0,"Steel","Silver",false,5,5,false,
                "Fixed",1000.0,"Fitness","Gym","Garage",true,6,4.4,"India",true);
        dumbBell3.dumbBellDetails();

        DumbBell dumbBell4 = new DumbBell(4,"HealthGear",12.0,14.0,"Iron","Black",true,25,10,true,
                "Adjustable",2800.0,"Fitness","Home","Gym",true,24,4.6,"USA",true);
        dumbBell4.dumbBellDetails();

        DumbBell dumbBell5 = new DumbBell(5,"CAP",7.0,10.0,"Steel","Blue",false,7,7,false,
                "Fixed",1500.0,"Fitness","Gym","Home",true,12,4.3,"USA",true);
        dumbBell5.dumbBellDetails();

        DumbBell dumbBell6 = new DumbBell(6,"Yes4All",15.0,16.0,"Iron","Black",true,30,5,true,
                "Adjustable",3500.0,"Fitness","Home","Gym",true,24,4.9,"USA",true);
        dumbBell6.dumbBellDetails();

        DumbBell dumbBell7 = new DumbBell(7,"PowerTec",10.0,12.0,"Steel","Gray",true,20,5,true,
                "Adjustable",2600.0,"Fitness","Gym","Home",true,24,4.7,"USA",true);
        dumbBell7.dumbBellDetails();

        DumbBell dumbBell8 = new DumbBell(8,"BodySolid",8.0,10.0,"Steel","Silver",false,8,8,false,
                "Fixed",1800.0,"Fitness","Gym","Garage",true,12,4.5,"USA",true);
        dumbBell8.dumbBellDetails();

        DumbBell dumbBell9 = new DumbBell(9,"Ironmaster",20.0,18.0,"Iron","Black",true,40,10,true,
                "Adjustable",5000.0,"Fitness","Home","Gym",true,36,5.0,"USA",true);
        dumbBell9.dumbBellDetails();

        DumbBell dumbBell10 = new DumbBell(10,"ProForm",6.0,9.0,"Steel","Red",false,6,6,false,
                "Fixed",1200.0,"Fitness","Gym","Home",true,12,4.2,"USA",true);
        dumbBell10.dumbBellDetails();
    }
}