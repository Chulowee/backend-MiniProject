package com.thoughtworks.booking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long waybill;

    private String datePickUp;

    public Long getWaybill() {
        return waybill;
    }

    public String getDatePickUp() {
        return datePickUp;
    }

    public void setDatePickUp(String datePickUp) {
        this.datePickUp = datePickUp;
    }

}
