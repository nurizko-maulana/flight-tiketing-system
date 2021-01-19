/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.io.Serializable;

/**
 *
 * @author SwarnnaNagesvaran
 */
public class makebooking implements Serializable {
   int numofpas;
   String nameofPas;
   String idofpas;
   String contNum;
   String departuredate;
   String arrivaldate;
   String email;
   String departureTime, arrivalTime;
   String destinationairport;
   String departureairport;
   float price;
   String seattype;
   
   
   public makebooking(){
    
       numofpas = 0;
       nameofPas = "";
       idofpas = "";
       contNum = "";
       departuredate = "";
       arrivaldate = "";
       email = "";
       departureTime = "";
       arrivalTime = "";
       destinationairport = "";
       departureairport = "";
       price = 0;
       seattype = "";
   
   }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public void setNumofpas(int numofpas) {
        this.numofpas = numofpas;
    }

    public void setNameofPas(String nameofPas) {
        this.nameofPas = nameofPas;
    }

    public void setIdofpas(String idofpas) {
        this.idofpas = idofpas;
    }

    public void setContNum(String contNum) {
        this.contNum = contNum;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDestinationairport(String destinationairport) {
        this.destinationairport = destinationairport;
    }

    public void setDepartureairport(String departureairport) {
        this.departureairport = departureairport;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeattype() {
        return seattype;
    }

    
    public int getNumofpas() {
        return numofpas;
    }

    public String getNameofPas() {
        return nameofPas;
    }

    public String getIdofpas() {
        return idofpas;
    }

    public String getContNum() {
        return contNum;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDestinationairport() {
        return destinationairport;
    }

    public String getDepartureairport() {
        return departureairport;
    }

    public float getPrice() {
        return price;
    }

    
   
   
}