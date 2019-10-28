package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelService {

    public static List<Bookings> search_bookings_by_customer_second_name(List<Bookings> bookings, String customer_name) {
        List<Bookings> customer_bookings = new ArrayList<Bookings>();
        for (Bookings booking: bookings) {
            if (booking.get_customer_second_name().equals(customer_name)) {
                customer_bookings.add(booking);
            }
        }
        return customer_bookings;
    }

    public static List<Room> search_available_rooms(List<Room> rooms, List<Bookings> existing_bookings, Date search_date, int capacity) {
        List<Room> available_rooms = new ArrayList<>();
        for (Room room : rooms)
            if (room.get_capacity() >= capacity) {
                boolean available = true;
                for (Bookings booking : existing_bookings) {
                    if (booking.get_booking_room_id() == room.get_room_id() &&
                            booking.get_booking_date().compareTo(search_date) == 0) available = false;
                }
                if (available) available_rooms.add(room);
            }
        return available_rooms;
    }

}
