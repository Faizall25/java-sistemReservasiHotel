/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
public class Room {
//Peng Engkasulasian
    
    //Instace Variabel
    private int id;
    private String type;
    private double price;
    private boolean status;

    //Constructor
    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.status = true;
    }

    public Room() {
    }

    //Method get set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String Status() {
        if (status) {
            return "Tersedia";
        } else {
            return "Tidak Tersedia";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
