package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Utils.parseDate;

public class Hotel {
    private int hotel_id;
    private String hotel_name;

    public Hotel(int hotel_id) {
        this.hotel_id = hotel_id;
        this.hotel_name = "Robs hotel";
    }

    public List<Room> get_rooms() {
        List<Room> list = new ArrayList<>();
        list.add(new Room(1,"A", 6));
        list.add(new Room(2,"B", 8));
        list.add(new Room(3,"C", 10));
        return list;
    }

    public List<Bookings> get_bookings() {
        List<Bookings> list = new ArrayList<>();
        list.add(new Bookings(1,parseDate("2014-02-01"),1, "Gillies"));
        list.add(new Bookings(2,parseDate("2014-02-09"), 1, "Gillies"));
        list.add(new Bookings(3,parseDate("2014-02-14"), 1, "Gillies"));
        return list;
    }

}
