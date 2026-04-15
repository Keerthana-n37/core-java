package com.xworkz.override.Information;

public class InformationRunner {

    public static void main(String[] args) {
        int[] dataPoints = {100, 200, 300};

        Source source = new Source("Database", "Server1");

        Information info = new Information("User Data", 1, 9.5, dataPoints, InfoLevel.HIGH, source);
        DetailedInformation detailedInformation = new DetailedInformation("Company Data", 2, 8.8, dataPoints, InfoLevel.MEDIUM, source, true, "Confidential");

        info.display();
        info.update();
        System.out.println(info);

        detailedInformation.display();
        detailedInformation.update();
        detailedInformation.showCategory();
        System.out.println(detailedInformation);
    }
}
