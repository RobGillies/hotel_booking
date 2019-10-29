package com.company;

import java.util.List;
import static com.company.HotelService.*;
import static com.company.HotelService.search_available_rooms;
import static com.company.HotelService.search_bookings_by_customer_second_name;
import static com.company.Utils.parseDate;


public class Main {

    public static void main(String[] args) {
        int hotel_id = 1;

        // Task 1 - print all rooms
        print_rooms(get_rooms(hotel_id));

        // Task 2 - search for bookings
        List<Bookings> customer_bookings = search_bookings_by_customer_second_name("Gillies");
        print_bookings(customer_bookings);

        // Task 3 - check availability
        List<Room> available_rooms = search_available_rooms(parseDate("2014-02-01"), 4);
        print_rooms(available_rooms);
    }

    public static void print_rooms(List<Room> rooms) {
        System.out.println("Rooms:");
        for (Room room: rooms) {
            System.out.println("Room: " + room.get_name() + " Capacity: " + room.get_capacity());
        }
    }

    public static void print_bookings(List<Bookings> bookings) {
        System.out.println("Bookings:");
        for (Bookings booking: bookings) {
            // need a new function in HotelService to return room_name from the room_id as room_id should be internal
            System.out.println("Room: " + booking.get_booking_room_id() + " Date: " + booking.get_booking_date());
        }
    }

}
