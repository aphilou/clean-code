package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Room {

    private final String number;
    private final int capacity;
    private final PriceType priceType;
    private final List<Booking> bookings;

    public Room(String number, int capacity, PriceType type) {
        this.number = number;
        this.capacity = capacity;
        this.priceType = type;
        this.bookings = new ArrayList<>();
    }

    public String getNumber() {

        return number;
    }

    public int getCapacity() {

        return capacity;
    }

    public boolean addReservation(LocalDate checkIn, LocalDate checkOut, int guestNb) {
        return this.bookings.add(new Booking(checkIn, checkOut, guestNb));
    }

    public void addExtraToBooking(LocalDate checkIn, HotelService extra) {
        Optional<Booking> booking = bookings.stream().filter(bk -> bk.getStartDate().equals(checkIn)).findFirst();
        booking.get().addExtra(extra);
    }
}
