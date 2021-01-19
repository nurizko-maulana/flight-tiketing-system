/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author thattshini
 */
public class Features {
    int id;
    String seatCat; 
    double seatWidth;
    String seatType;
    String videoType; 
    String powerType;
    String wifi; 

    public Features() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeatCat() {
        return seatCat;
    }

    public void setSeatCat(String seatCat) {
        this.seatCat = seatCat;
    }

    public double getSeatWidth() {
        return seatWidth;
    }

    public void setSeatWidth(double seatWidth) {
        this.seatWidth = seatWidth;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getPowerType() {
        return powerType;
    }

    public void setPowerType(String powerType) {
        this.powerType = powerType;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
    
    
}
