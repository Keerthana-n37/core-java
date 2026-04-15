package com.xworkz.override.Information;

public class DetailedInformation extends Information{

    boolean isVerified;
    String category;

    DetailedInformation(String title, int id, double importance, int[] dataPoints, InfoLevel level, Source source, boolean isVerified, String category) {
        super(title, id, importance, dataPoints, level, source);
        this.isVerified = isVerified;
        this.category = category;
    }

    void display() {
        System.out.println("Displaying detailed information: " + title);
    }

    void update() {

        System.out.println("Updating detailed information: " + title);
    }

    void showCategory() {
        System.out.println("Category: " + category);
    }

    public String toString() {
        return "DetailedInformation{isVerified=" + isVerified + ", category='" + category + "'} " + super.toString();
    }
}
