class TrophyRunner {

    public static void main(String[] args) {

        Trophy trophy1 = new Trophy(1,"Champion Trophy","Cup","Metal",
                12.5,2.5,"Gold",5000.0,
                "Cricket World Cup","India",2023,"India","Karnataka",
                true,false,false,"Sports","PVR",4.9,true);
        trophy1.displayTrophy();

        Trophy trophy2 = new Trophy(2,"Best Actor","Star","Metal",
                10.0,1.8,"Silver",3000.0,
                "Film Awards","Raj",2022,"India","Maharashtra",
                false,true,false,"Entertainment","FilmClub",4.8,true);
        trophy2.displayTrophy();

        Trophy trophy3 = new Trophy(3,"MVP Trophy","Cup","Metal",
                11.0,2.0,"Gold",4000.0,
                "Football League","Messi",2021,"Spain","Catalonia",
                true,false,false,"Sports","FIFA",4.9,true);
        trophy3.displayTrophy();

        Trophy trophy4 = new Trophy(4,"Best Student","Star","Crystal",
                9.5,1.2,"Transparent",2000.0,
                "School Awards","Ria",2023,"India","Karnataka",
                false,false,true,"Education","SchoolBoard",4.7,true);
        trophy4.displayTrophy();

        Trophy trophy5 = new Trophy(5,"Olympic Medal","Medal","Metal",
                8.0,0.8,"Gold",6000.0,
                "Olympics","USA",2021,"USA","California",
                true,false,false,"Sports","Olympic Committee",5.0,true);
        trophy5.displayTrophy();

        Trophy trophy6 = new Trophy(6,"Innovation Award","Cup","Crystal",
                10.5,1.5,"Blue",3500.0,
                "Tech Expo","XYZ",2022,"India","Delhi",
                false,false,true,"Technology","TechClub",4.6,true);
        trophy6.displayTrophy();

        Trophy trophy7 = new Trophy(7,"Music Trophy","Star","Metal",
                9.0,1.3,"Silver",2500.0,
                "Music Awards","Amit",2023,"India","Maharashtra",
                false,true,false,"Entertainment","MusicFest",4.5,true);
        trophy7.displayTrophy();

        Trophy trophy8 = new Trophy(8,"Best Teacher","Star","Crystal",
                10.0,1.4,"Transparent",3000.0,
                "School Awards","Sunita",2023,"India","Karnataka",
                false,false,true,"Education","EduBoard",4.8,true);
        trophy8.displayTrophy();

        Trophy trophy9 = new Trophy(9,"Chess Trophy","Cup","Metal",
                11.5,2.0,"Bronze",2800.0,
                "Chess Tournament","Anand",2022,"India","Tamil Nadu",
                false,false,true,"Sports","ChessFed",4.7,true);
        trophy9.displayTrophy();

        Trophy trophy10 = new Trophy(10,"Dance Trophy","Star","Crystal",
                9.5,1.1,"Transparent",2200.0,
                "Dance Competition","Asha",2023,"India","Kerala",
                false,false,true,"Entertainment","DanceClub",4.6,true);
        trophy10.displayTrophy();
    }
}