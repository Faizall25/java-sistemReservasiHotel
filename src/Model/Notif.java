/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Log;
import Model.Log;

/**
 *
 * @author hp
 */
public class Notif extends Log { //Class turunan dari log (Has a) | menjalankan method dari superclass

    //Method notif berhasil pada insert di class repository(room & reservasi)
    @Override
    public void info(String Massage) {
        System.out.println("Action " + Massage + " has succesfuly");
    }

    //Method notif gagal/eror pada insert di class repository(room & reservasi)
    @Override
    public void eror(String Massage) {
        System.out.println("Action " + Massage + " has decilend"); //To change body of generated methods, choose Tools | Templates.
    }

}
