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
    String nameofpay;
    String cardnum;
    String expiry;
    String cvv;

    public String getNameofpay() {
        return nameofpay;
    }

    public void setNameofpay(String nameofpay) {
        this.nameofpay = nameofpay;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    

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
