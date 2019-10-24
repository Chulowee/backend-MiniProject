package com.thoughtworks.booking.controller;

import com.thoughtworks.booking.model.Booking;
import com.thoughtworks.booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public HttpEntity createBooking(@RequestBody Booking booking){
        Booking isCreated = bookingService.save(booking);
        return new ResponseEntity<>(isCreated,HttpStatus.CREATED);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(code = HttpStatus.OK)
    public Iterable<Booking> listOfParkingLots() {
        return bookingService.findAll();
    }

}