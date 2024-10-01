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
public class Guest {
//Pengengkasulasian (
    
    //Instance Variabel
    private int Id;
    private String name;
    private int contact;
    private String addres;
    private String country;
    private String gender;

    //Constructor
    public Guest(int Id, String name, int contact, String addres, String country, String gender) {
        this.Id = Id;
        this.name = name;
        this.contact = contact;
        this.addres = addres;
        this.country = country;
        this.gender = gender;
    }

    public Guest() {
    }

    //Method
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
// )
}
