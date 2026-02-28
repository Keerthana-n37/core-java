class StandRunner {

    public static void main(String[] args) {

        Stand stand1 = new Stand(1,"Laptop Stand","Adjustable","Steel",
                1500.0,50,"Black", 15.5,25.0,true,
                "HP","Office","Rectangle",1.2,"ABC Traders","India",
                4.6,"Electronics",1,true);
        stand1.displayStand();

        Stand stand2 = new Stand(2,"Mobile Stand","Table","Plastic",
                300.0,100,"White",8.0,5.0,false,
                "Boat","Home","Square",0.3,"XYZ Traders","India",
                4.2,"Accessories",6,true);
        stand2.displayStand();

        Stand stand3 = new Stand(3,"TV Stand","Floor","Wood",
                5000.0,20,"Brown", 120.0,80.0,false,
                "Ikea","Living Room","Rectangle",15.0,"HomeMart","Sweden",
                4.7,"Furniture",2,true);
        stand3.displayStand();

        Stand stand4 = new Stand(4,"Book Stand","Desk","Metal",
                700.0,60,"Grey",10.0,18.0,true,
                "Navneet","Study","Triangle",0.8,"BookWorld","India",
                4.4,"Stationery",1,true);
        stand4.displayStand();

        Stand stand5 = new Stand(5,"Mic Stand","Adjustable","Aluminum",
                2500.0,30,"Black",150.0,30.0,true,
                "Sony","Studio","Round",3.5,"MusicStore","Japan",
                4.8,"Audio",2,true);
        stand5.displayStand();

        Stand stand6 = new Stand(6,"Camera Stand","Tripod","Fiber",
                3500.0,25,"Black",140.0,40.0,true,
                "Canon","Photography","Tripod", 2.5,"PhotoHub","USA",
                4.6,"Camera",3,true);
        stand6.displayStand();

        Stand stand7 = new Stand(7,"Plant Stand","Decor","Wood",
                1200.0,40,"Brown",60.0,35.0,false,
                "HomeStyle","Garden","Round", 4.0,"GardenMart","India",
                4.3,"Decor",1,true);
        stand7.displayStand();

        Stand stand8 = new Stand(8,"Shoe Stand","Rack","Plastic",
                900.0,70,"Blue",100.0,50.0,false,
                "Nilkamal","Home","Rectangle",6.0,"FurnitureWorld","India",
                4.1,"Home",1,true);
        stand8.displayStand();

        Stand stand9 = new Stand(9,"Tablet Stand","Portable","Plastic",
                400.0,90,"White", 9.0,12.0,true,
                "Samsung","Office","Rectangle", 0.4,"TechStore","Korea",
                4.5,"Accessories",1,true);
        stand9.displayStand();

        Stand stand10 = new Stand(10,"Projector Stand","Adjustable","Steel",
                4500.0,15,"Black",130.0,60.0,true,
                "Epson","Office","Rectangle", 10.0,"OfficeMart","Japan",
                4.7,"Electronics",2,true);
        stand10.displayStand();
    }
}