/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;

/**
 *
 * @author duncanleo
 */
public class Flight1 implements Serializable{
    private int id;
    private String flightNo;
    private String destination;
    private String departure;
    private Timestamp duration;
    private Time depatureTime;
    private Time arrivalTime;
    private String seatType;
    private double businnessPrice;
    private double economicPrice;
    private double firstclassPrice;
    private double seattype;
  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the flightNo
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * @param flightNo the flightNo to set
     */
    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the arrival
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Timestamp getDuration() {
        return duration;
    }

    public void setDuration(Timestamp duration) {
        this.duration = duration;
    }

    public Time getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(Time depatureTime) {
        this.depatureTime = depatureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

   

    /**
     * @return the seatType
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * @param seatType the seatType to set
     */
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    /**
     * @return the businnessPrice
     */
    public double getBusinnessPrice() {
        return businnessPrice;
    }

    /**
     * @param businnessPrice the businnessPrice to set
     */
    public void setBusinnessPrice(double businnessPrice) {
        this.businnessPrice = businnessPrice;
    }

    /**
     * @return the economicPrice
     */
    public double getEconomicPrice() {
        return economicPrice;
    }

    /**
     * @param economicPrice the economicPrice to set
     */
    public void setEconomicPrice(double economicPrice) {
        this.economicPrice = economicPrice;
    }

    public double getFirstclassPrice() {
        return firstclassPrice;
    }

    public void setFirstclassPrice(double firstclassPrice) {
        this.firstclassPrice = firstclassPrice;
    }

    public double getSeattype() {
        return seattype;
    }

    public void setSeattype(double seattype) {
        this.seattype = seattype;
    }
    
    
    
}
