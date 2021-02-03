/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.io.Serializable;
import java.sql.Date;

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
      
    
    
}
