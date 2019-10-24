package com.thoughtworks.booking.repository;

import com.thoughtworks.booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepo extends JpaRepository<Booking, String> {

//    Optional<Booking> findByPlateNumber(Str) ;
}
