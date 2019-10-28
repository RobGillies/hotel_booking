package com.company;

public class Room {
    private int room_id;
    private String room_name;
    private int capacity;

    public Room(int room_id, String room_name, int capacity) {
        this.room_id = room_id;
        this.room_name = room_name;
        this.capacity = capacity;
    }

    public int get_room_id() {
        return room_id;
    }

    public String get_name() {
        return room_name;
    }

    public int get_capacity() {
        return capacity;
    }
}
