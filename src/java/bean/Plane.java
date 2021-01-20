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
public class Plane implements Serializable{
    private int id;
    private String model;
    private int year;
    private int feature_id;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the feature_id
     */
    public int getFeature_id() {
        return feature_id;
    }
}
