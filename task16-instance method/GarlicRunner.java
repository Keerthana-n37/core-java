class GarlicRunner {

    public static void main(String[] args) {

        Garlic garlic1= new Garlic(101,"White Garlic","White","Local",
                120.0,1000,"Karnataka",true,1.5,12,
                "Medium","Strong","FreshFarm","ABC Traders","India",
                4.8,"Vegetable",5,10.5,true);
        garlic1.showGarlic();

        Garlic garlic2 = new Garlic(102,"Red Garlic","Red","Hybrid",
                150.0,800,"Tamil Nadu", false,1.2,10,
                "Small","Mild","NatureBest","XYZ Traders","India",
                4.5,"Vegetable",4,11.0,true);
        garlic2.showGarlic();

        Garlic garlic3 = new Garlic(103,"Organic Garlic","White","Organic",
                200.0,600,"Kerala",true,1.0,14,
                "Large","Strong","GreenLeaf","Fresh Mart","India",
                4.9,"Organic",3,9.8,true);
       garlic3.showGarlic();

        Garlic garlic4 = new Garlic(104,"Chinese Garlic","White","Imported",
                180.0,500,"China",false,1.3,11,
                "Medium","Medium","AsiaFarm", "Global Traders","China",
                4.2,"Imported",6,12.0,false);
        garlic4.showGarlic();

        Garlic garlic5 = new Garlic(105,"Desi Garlic","White","Local",
                110.0,900,"Andhra Pradesh",true,1.4,13,
                "Medium","Strong","VillageFresh", "Local Market","India",
                4.6,"Vegetable",5,10.2,true);
        garlic5.showGarlic();

        Garlic garlic6 = new Garlic(106,"Small Garlic","White","Local",
                90.0,700,"Maharashtra",false,0.9,8,
                "Small","Mild","FarmPick","City Traders","India",
                4.1,"Vegetable",4,11.5,true);
        garlic6.showGarlic();

        Garlic garlic7 = new Garlic(107,"Big Garlic","White","Premium",
                220.0,400,"Punjab", true,1.8,16,
                "Large","Strong","PremiumFarm","Super Mart","India",
                4.7,"Premium",2,9.5,true);
        garlic7.showGarlic();

        Garlic garlic8 = new Garlic(108,"Dry Garlic","Brown","Processed",
                130.0,650,"Gujarat", false,1.1,9,
                "Medium","Strong","DryFresh","Wholesale Market","India",
                4.3,"Processed", 5,8.9,true);
        garlic8.showGarlic();

        Garlic garlic9 = new Garlic(109,"Fresh Garlic","White","Local",
                140.0,850,"Telangana",true,1.6,15,
                "Large","Strong","FreshBasket","Agro Traders","India",
                4.8,"Vegetable",6,10.0,true);
        garlic9.showGarlic();

        Garlic garlic10 = new Garlic(110,"Premium Garlic","White","Export",
                250.0,300,"Haryana", true,2.0,18,
                "Large","Very Strong","ExportFarm","Export Traders","India",
                5.0,"Export",2,9.0,true);
        garlic10.showGarlic();
    }
}