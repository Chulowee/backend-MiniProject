package com.thoughtworks.booking.service;

import com.thoughtworks.booking.model.Booking;
import com.thoughtworks.booking.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    public Booking save(Booking booking) {
        return bookingRepo.save(booking);
    }

    public Iterable<Booking> findAll() {
        return bookingRepo.findAll();
    }
}
