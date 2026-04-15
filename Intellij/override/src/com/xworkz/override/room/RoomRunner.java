package com.xworkz.override.room;

public class RoomRunner {

    public static void main(String[] args) {

        String[] facilities = {"WiFi", "TV", "AC"};

        Person person= new Person("Arjun", 22);

        Room room = new Room("101", 1, facilities, ComfortLevel.BASIC, person);

        LuxuryRoom luxuryRoom = new LuxuryRoom("201", 2, facilities, ComfortLevel.PREMIUM, person, true, "Sea View"
        );

        room.openRoom();
        room.closeRoom();
        System.out.println(room);

        System.out.println("-------------------");

        luxuryRoom.openRoom();
        luxuryRoom.closeRoom();
        luxuryRoom.showView();
        System.out.println(luxuryRoom);
    }
}
