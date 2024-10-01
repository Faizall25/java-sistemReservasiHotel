/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Reservasi {
//Peng Engkasulasian
    
    //Instace Variabel
    private int id, guestId, roomId;
    private String tglCheckin;
    private String tglCheckout;
    private double jumlahBayar;
    private String methodeBayar;
    private int totalHari;

    //Constructor
    public Reservasi(int id, int guestId, int roomId, String tglCheckin, String tglCheckout,double jumlahBayar, String methodeBayar, int totalHari) {
        this.id = id;
        this.guestId = guestId;
        this.roomId = roomId;
        this.tglCheckin = tglCheckin;
        this.tglCheckout = tglCheckout;
        this.jumlahBayar = jumlahBayar;
        this.methodeBayar = methodeBayar;
        this.totalHari = totalHari;
    }

    public Reservasi() {
    }

    //Method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getTglCheckin() {
        return tglCheckin;
    }

    public void setTglCheckin(String tglCheckin) {
        this.tglCheckin = tglCheckin;
    }

    public String getTglCheckout() {
        return tglCheckout;
    }

    public void setTglCheckout(String tglCheckout) {
        this.tglCheckout = tglCheckout;
    }
    
    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getMethodeBayar() {
        return methodeBayar;
    }

    public void setMethodeBayar(String methodeBayar) {
        this.methodeBayar = methodeBayar;
    }

    public int getTotalHari() {
        return totalHari;
    }

    public void setTotalHari(int totalHari) {
        this.totalHari = totalHari;
    }
    
    
}
