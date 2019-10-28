package com.company;

import java.util.Date;

public class Bookings {
    private int booking_id;
    private Date booking_date;
    private int room_id;
    private String customer_second_name;

    public Bookings(int booking_id, Date booking_date, int room_id, String customer_second_name) {
        this.booking_id = booking_id;
        this.booking_date = booking_date;
        this.room_id = room_id;
        this.customer_second_name = customer_second_name;
    }

    public int get_booking_id() {
        return booking_id;
    }

    public Date get_booking_date() {
        return booking_date;
    }

    public int get_booking_room_id() {
        //should we get room name here or in main?
        return room_id;
    }

    public String get_customer_second_name() {
        return customer_second_name;
    }
}






