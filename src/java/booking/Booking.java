/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author SwarnnaNagesvaran
 */
public class Booking implements Serializable {
     int id;    
    int numofpas;    
    String seatCat;
    int baggage;   
    Date booking;
    String destination_arrival;
    Time departureTime;
    Time arrivalTime;
    Date departureDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumofpas() {
        return numofpas;
    }

    public void setNumofpas(int numofpas) {
        this.numofpas = numofpas;
    }

    public String getSeatCat() {
        return seatCat;
    }

    public void setSeatCat(String seatCat) {
        this.seatCat = seatCat;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public Date getBooking() {
        return booking;
    }

    public void setBooking(Date booking) {
        this.booking = booking;
    }
   

    public String getDestination_arrival() {
        return destination_arrival;
    }

    public void setDestination_arrival(String destination_arrival) {
        this.destination_arrival = destination_arrival;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    
    
}
