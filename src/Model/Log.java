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
public abstract class Log { //Class Abstrac untuk logging/menampilkan keterangan di button Room dan Reservasi

    public abstract void info(String Massage); //Logging success

    public abstract void eror(String Massage); //Logging Erorr

}
