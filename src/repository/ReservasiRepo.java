/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Model.Notif;
import Model.Repo;
import java.util.ArrayList;
import java.util.List;
import Model.*;

/**
 *
 * @author hp
 */
public class ReservasiRepo implements Repo {

    private static List<Reservasi> datas = new ArrayList<>();
    private static Notif notif = new Notif(); //Object menampung data/method dari subclass abstrac

    public static List<Reservasi> getAll() {
        return datas;
    }

    public static Reservasi getById(int id) {
        for (Reservasi data : datas) {
            if (data.getId() == id) {
                return data;
            }
        }

        return null;
    }

    public static boolean insert(Reservasi reservasi) {
        try {
            datas.add(reservasi);
            notif.info("add room");//notif sukses
            return true;
        } catch (Exception e) {
            notif.eror(e.getMessage());//notif eror
            return false;
        }
    }

    public static boolean deleteAll() {
        try {
            datas.clear();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Reservasi tampilDataById() {
        for (Reservasi data : datas) {

        }

        return null;
    }

    public static boolean deleteById(int id) {
        for (Reservasi data : datas) {
            if (data.getId() == id) {
                datas.remove(data);
                return true;
            }
        }
        return false;
    }

    //Cetak Data di Output
    @Override
    public void ToString() {
        System.out.println("=== Data Reservasi ===");
        for (Reservasi data : datas) {
            System.out.println("ID Reservasi :" +  data.getId());
            System.out.println("Tanggal Check In :" + data.getTglCheckin());
            System.out.println("Tanggal Check Out :" + data.getTglCheckout());
        }
    }

}
