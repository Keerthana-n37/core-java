class PaperRunner{

    public static void main(String[] args) {

        Paper p1 = new Paper(1, "A4 Paper", "White", "A4",
                250.0, 1000, "Printing", "JK",2.5, 500, true,
                "High", "Wood Pulp", "Rectangle",0.12, 10, "ABC Suppliers",
                "India", 4.8, "Stationery");
        p1.displayDetails();

        Paper p2 = new Paper(2, "Chart Paper", "Blue", "A3",
                120.0, 500, "Drawing", "Navneet",1.8, 200, true,
                "Medium", "Recycled", "Rectangle",0.20, 5, "XYZ Traders",
                "India", 4.5, "Art");
        p2.displayDetails();

        Paper p3 = new Paper(3, "Glossy Paper", "White", "A4",
                300.0, 300, "Photo", "HP",2.0, 250, false,
                "Premium", "Gloss Finish", "Rectangle", 0.15, 8, "Global Supplies",
                "USA", 4.6, "Printing");
        p3.displayDetails();

        Paper p4 = new Paper(4, "Brown Paper", "Brown", "Large",
                180.0, 400, "Packaging", "EcoWrap",3.2, 150, true,
                "Strong", "Kraft", "Rectangle",0.30, 6, "Green Traders",
                "India", 4.3, "Packaging");
        p4.displayDetails();

        Paper p5 = new Paper(5, "Notebook Paper", "White", "A4",
                200.0, 800, "Writing", "Classmate", 2.1, 400, true,
                "Smooth", "Wood Pulp", "Rectangle",0.10, 12, "School Mart",
                "India", 4.7, "Education");
        p5.displayDetails();

        Paper p6 = new Paper(6, "Color Paper", "Pink", "A4",
                150.0, 600, "Craft", "FunArt",
                1.5, 300, true,
                "Soft", "Recycled", "Rectangle",
                0.08, 7, "Art World",
                "India", 4.4, "Craft");
        p6.displayDetails();

        Paper p7 = new Paper(7, "Tissue Paper", "White", "Small",
                90.0, 1500, "Cleaning", "Origami",1.2, 100, true,
                "Soft", "Pulp", "Square",0.05, 20, "Daily Needs",
                "India", 4.9, "Hygiene");
        p7.displayDetails();

        Paper p8 = new Paper(8, "Butter Paper", "White", "Medium",
                220.0, 350, "Baking", "BakeWell",1.9, 180, false,
                "Food Grade", "Wax Coated", "Rectangle",0.07, 9, "Kitchen Store",
                "India", 4.2, "Kitchen");
        p8.displayDetails();

        Paper p9 = new Paper(9, "Cardboard", "Brown", "Large",
                320.0, 250, "Boxes", "PackPro",4.5, 80, true,
                "Heavy", "Kraft", "Rectangle",0.40, 4, "Box Makers",
                "India", 4.1, "Industrial");
        p9.displayDetails();

        Paper p10 = new Paper(10, "Newspaper", "Grey", "Standard",
                10.0, 5000, "Reading", "Times", 1.0, 40, false,
                "Basic", "Recycled", "Rectangle", 0.03, 50, "News Agency",
                "India", 4.0, "Media");
        p10.displayDetails();
    }
}