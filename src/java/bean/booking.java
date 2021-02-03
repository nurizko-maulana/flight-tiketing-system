/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;



/**
 *
 * @author SwarnnaNagesvaran
 */
public class booking implements Serializable{
    int id;
    String nameofPas;
    String numofPas;
    String flightNo;
    String departure;
    String destination;
    Date departureDate;
    Time departureTime;
    Time arrivalTime;
    String seattype;
    int baggage;
    double price;
    String nameofPay;
    String cardtype;
    String cardNum;
    String expiry;
    String cvv;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameofPas() {
        return nameofPas;
    }

    public void setNameofPas(String nameofPas) {
        this.nameofPas = nameofPas;
    }

    public String getNumofPas() {
        return numofPas;
    }

    public void setNumofPas(String numofPas) {
        this.numofPas = numofPas;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
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

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
