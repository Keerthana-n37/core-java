class CellRunner {

    public static void main(String[] args) {

        Cell cell1 = new Cell(1,"Red Blood Cell","Human",7.5,
                "Round",false,"Transport Oxygen",
                "Blood","None",true,46,
                "Glucose",true,"Red",
                "1665","Robert Hooke",
                120,false,"None","Healthy");
        cell1.aboutCell();

        Cell cell2 = new Cell(2,"White Blood Cell","Human",10,
                "Irregular",true,"Fight Infection",
                "Blood","None",true,46,
                "Glucose",true,"White",
                "1665","Robert Hooke",
                5,false,"None","Healthy");
        cell2.aboutCell();

        Cell cell3 = new Cell(3,"Neuron","Human",100,
                "Branched",true,"Transmit Signals",
                "Brain","None",true,46,
                "Glucose",false,"Gray",
                "1837","Theodor Schwann",
                36500,false,"None","Healthy");
        cell3.aboutCell();

        Cell cell4 = new Cell(4,"Muscle Cell","Human",50,
                "Long",true,"Movement",
                "Muscles","None",true,46,
                "Glucose",true,"Pink",
                "1837","Schwann",
                1000,false,"None","Healthy");
        cell4.aboutCell();

        Cell cell5 = new Cell(5,"Plant Cell","Plant",40,
                "Rectangular",true,"Photosynthesis",
                "Leaf","Cellulose",true,24,
                "Sunlight",true,"Green",
                "1665","Robert Hooke",
                365,false,"None","Healthy");
        cell5.aboutCell();

        Cell cell6 = new Cell(6,"Bacterial Cell","Bacteria",2,
                "Rod",false,"Reproduction",
                "Environment","Peptidoglycan",false,1,
                "Organic Matter",true,"Transparent",
                "1676","Antonie van Leeuwenhoek",
                1,true,"Infection","Harmful");
        cell6.aboutCell();

        Cell cell7 = new Cell(7,"Skin Cell","Human",30,
                "Flat",true,"Protection",
                "Skin","None",true,46,
                "Glucose",true,"Skin Color",
                "1665","Robert Hooke",
                28,false,"None","Healthy");
        cell7.aboutCell();

        Cell cell8 = new Cell(8,"Egg Cell","Human",120,
                "Round",true,"Reproduction",
                "Ovary","None",true,23,
                "Nutrients",false,"Yellowish",
                "1827","Karl Ernst von Baer",
                1,false,"None","Healthy");
        cell8.aboutCell();

        Cell cell9 = new Cell(9,"Sperm Cell","Human",60,
                "Tail",true,"Fertilization",
                "Testes","None",true,23,
                "Fructose",false,"Transparent",
                "1677","Leeuwenhoek",
                3,false,"None","Healthy");
        cell9.aboutCell();

        Cell cell10 = new Cell(10,"Cancer Cell","Human",20,
                "Irregular",true,"Uncontrolled Growth",
                "Various","None",true,46,
                "Glucose",true,"Varies",
                "1858","Rudolf Virchow",
                200,true,"Cancer","Critical");
        cell10.aboutCell();
    }
}