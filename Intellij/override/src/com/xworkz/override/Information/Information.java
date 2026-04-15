package com.xworkz.override.Information;

import java.util.Arrays;

public class Information {

    String title;
    int id;
    double importance;
    int[] dataPoints;
    InfoLevel level;
    Source source;

    Information(String title, int id, double importance, int[] dataPoints, InfoLevel level, Source source) {
        this.title = title;
        this.id = id;
        this.importance = importance;
        this.dataPoints = dataPoints;
        this.level = level;
        this.source = source;
    }

    void display() {
        System.out.println("Displaying information: " + title);
    }

    void update() {
        System.out.println("Updating information: " + title);
    }

    public String toString() {
        return "Information{title='" + title +
                "', id=" + id +
                ", importance=" + importance +
                ", dataPoints=" + Arrays.toString(dataPoints) +
                ", level=" + level +
                ", source=" + source +
                "}";
    }
}
