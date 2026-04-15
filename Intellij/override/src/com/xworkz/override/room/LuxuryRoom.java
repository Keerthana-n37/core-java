package com.xworkz.override.room;

public class LuxuryRoom extends Room{

    boolean isAC;
    String viewType;

    LuxuryRoom(String roomNumber, int floor, String[] facilities,
               ComfortLevel level, Person person,
               boolean isAC, String viewType) {

        super(roomNumber, floor, facilities, level, person);
        this.isAC = isAC;
        this.viewType = viewType;
    }

    void openRoom() {
        System.out.println("Luxury Room opened");
    }

    void closeRoom() {
        System.out.println("Luxury Room closed");
    }

    void showView() {
        System.out.println("View Type: " + viewType);
    }

    public String toString() {
        return "LuxuryRoom{isAC=" + isAC +
                ", viewType='" + viewType + "'} " + super.toString();
    }
}
