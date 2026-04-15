package com.xworkz.override.room;

import java.util.Arrays;

public class Room {

    String roomNumber;
    int floor;
    String[] facilities;
    ComfortLevel level;
    Person person;

    Room(String roomNumber, int floor, String[] facilities, ComfortLevel level, Person person) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.facilities = facilities;
        this.level = level;
        this.person = person;
    }

    void openRoom() {
        System.out.println("Room opened");
    }

    void closeRoom() {
        System.out.println("Room closed");
    }

    public String toString() {
        return "Room{roomNumber='" + roomNumber + "', floor=" + floor + ", facilities=" + Arrays.toString(facilities) + ", level=" + level + ", person=" + person + "}";
    }
}
