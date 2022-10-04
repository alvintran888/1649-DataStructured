/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.ui;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Accessories implements Serializable{
    
    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void remove(int removeIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int id;
    String accessory;
    String category;
    String publisher;
    double cost;

    public int getId() {
        return id;
    }

    public String getAccessory() {
        return accessory;
    }

    public String getCategory() {
        return category;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getCost() {
        return cost;
    }
    ////////////////////////////////////
    
    public void setId(int id) {
        this.id = id;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }



  
    
}
