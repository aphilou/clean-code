package model;

import java.util.Map;

public class Hotel {

    private String name;
    Map<Integer, Room> rooms;

    public Hotel(String name, Map<Integer, Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }
}
