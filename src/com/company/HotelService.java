package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelService {

    public static List<Room> get_rooms(int hotel_id) {
        Hotel hotel = new Hotel(1);
        return hotel.get_rooms();
    }

    public static List<Bookings> get_bookings(int hotel_id) {
        Hotel hotel = new Hotel(1);
        return hotel.get_bookings();
    }

    public static List<Bookings> get_bookings_by_room_id(int room_id) {
        List<Bookings> bookings = get_bookings(1);
        List<Bookings> room_bookings = new ArrayList<Bookings>();

        for (Bookings booking: bookings) {
            if (booking.get_booking_room_id() == room_id) {
                room_bookings.add(booking);
            }
        }
        return room_bookings;
    }

    public static List<Bookings> get_bookings_by_customer_second_name(String customer_name) {
        List<Bookings> bookings = get_bookings(1);
        List<Bookings> customer_bookings = new ArrayList<Bookings>();

        for (Bookings booking: bookings) {
            if (booking.get_customer_second_name().equals(customer_name)) {
                customer_bookings.add(booking);
            }
        }
        return customer_bookings;
    }

    public static List<Room> get_available_rooms(Date search_date, int capacity) {
        List<Room> rooms = get_rooms(1);
        List<Room> available_rooms = new ArrayList<>();

        for (Room room : rooms) {
            boolean available = true;
            if (room.get_capacity() >= capacity) {
                List<Bookings> bookings = get_bookings_by_room_id(room.get_room_id());
                for (Bookings booking : bookings) {
                    if (booking.get_booking_date().compareTo(search_date) == 0) available = false;
                }
                if (available) available_rooms.add(room);
            }
        }
        return available_rooms;

    }


}
