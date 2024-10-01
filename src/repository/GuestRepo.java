/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import Model.Repo;
import java.util.ArrayList;
import java.util.List;
import Model.Guest;

/**
 *
 * @author hp
 */
public class GuestRepo implements Repo {

    private static List<Guest> datas = new ArrayList<>();

    public static List<Guest> getAll() {
        return datas;
    }

    public static Guest getById(int id) {
        for (Guest data : datas) {
            if (data.getId() == id) {
                return data;
            }
        }

        return null;
    }

    public static boolean insert(Guest guest) {
        try {
            datas.add(guest);
            return true;
        } catch (Exception e) {
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

    //Cetak Data di Output
    @Override
    public void ToString() {
        System.out.println("=== Data Kamar ===");
        for (Guest data : datas) {
            System.out.println("ID :" + data.getId());
            System.out.println("Nama :" + data.getName());
            System.out.println("Alamat :" + data.getAddres());
        }
    }

}
