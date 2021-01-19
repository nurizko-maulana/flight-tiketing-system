/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author duncanleo
 */
public class Flight implements Serializable{
    private int id;
    private String flightNo;
    private String destination;
    private String arrival;
    private String duration;
    private String depatureTime;
    private String arrivalTime;
    private String seatType;
    private double businnessPrice;
    private double economicPrice;

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
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the depatureTime
     */
    public String getDepatureTime() {
        return depatureTime;
    }

    /**
     * @param depatureTime the depatureTime to set
     */
    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
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
}
