class ToxicRunner {

    public static void main(String[] args)
	{
        Toxic toxic1 = new Toxic(1,"Mercury","Metal","Factory",
                "Liquid",50.5,8,"Nervous Damage",
                true,"Scientist A",1950,
                13.5,25.0,"Silver","None",
                4.5,"Chemical","Lab",true,"High");
        toxic1.viewToxic();

        Toxic toxic2 = new Toxic(2,"Carbon Monoxide","Gas","Vehicle",
                "Gas",30.0,7,"Breathing Problem",
                true,"Scientist B",1940,
                1.2,20.0,"Colorless","Odorless",
                4.2,"Air","City",true,"High");
        toxic2.viewToxic();

        Toxic toxic3 = new Toxic(3,"Lead","Metal","Paint",
                "Solid",60.0,6,"Brain Damage",
                true,"Scientist C",1930,
                11.3,22.0,"Gray","None",
                4.3,"Chemical","Factory",true,"Medium");
        toxic3.viewToxic();

        Toxic toxic4 = new Toxic(4,"Chlorine","Gas","Industry",
                "Gas",45.0,7,"Skin Irritation",
                true,"Scientist D",1920,
                3.2,18.0,"Green","Strong",
                4.0,"Gas","Plant",true,"High");
        toxic4.viewToxic();

        Toxic toxic5 = new Toxic(5,"Arsenic","Chemical","Soil",
                "Solid",25.0,9,"Poisoning",
                true,"Scientist E",1910,
                5.7,21.0,"White","Garlic",
                4.6,"Mineral","Ground",true,"High");
        toxic5.viewToxic();

        Toxic toxic6 = new Toxic(6,"Benzene","Liquid","Petrol",
                "Liquid",35.0,8,"Cancer Risk",
                true,"Scientist F",1960,
                0.9,27.0,"Clear","Sweet",
                4.4,"Chemical","Refinery",true,"High");
        toxic6.viewToxic();

        Toxic toxic7 = new Toxic(7,"Ammonia","Gas","Farm",
                "Gas",40.0,6,"Eye Irritation",
                true,"Scientist G",1955,
                0.7,19.0,"Colorless","Pungent",
                3.9,"Gas","Farm",false,"Medium");
        toxic7.viewToxic();

        Toxic toxic8 = new Toxic(8,"Formaldehyde","Liquid","Lab",
                "Liquid",20.0,7,"Skin Allergy",
                true,"Scientist H",1945,
                1.1,23.0,"Colorless","Strong",
                4.1,"Chemical","Laboratory",true,"High");
        toxic8.viewToxic();

        Toxic toxic9 = new Toxic(9,"Nickel","Metal","Industry",
                "Solid",55.0,5,"Skin Reaction",
                false,"Scientist I",1970,
                8.9,24.0,"Silver","None",
                3.8,"Metal","Factory",false,"Low");
        toxic9.viewToxic();

        Toxic toxic10 = new Toxic(10,"Sulfur Dioxide","Gas","Power Plant",
                "Gas",70.0,8,"Lung Damage",
                true,"Scientist J",1935,
                2.9,17.0,"Colorless","Sharp",
                4.7,"Air","Plant",true,"High");
        toxic10.viewToxic();
    }
}