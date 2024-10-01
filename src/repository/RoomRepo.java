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
public class RoomRepo implements Repo {

    private static List<Room> datas = new ArrayList<>();
    private static Notif notif = new Notif(); //Object menampung data/method dari subclass abstrac

    public static List<Room> getAll() {
        return datas;
    }

    public static Room getById(int id) {
        for (Room data : datas) {
            if (data.getId() == id) {
                return data;
            }
        }

        return null;
    }

    public static boolean insert(Room room) {
        try {
            datas.add(room);
            notif.info("add room"); //Notif succsess
            return true;
        } catch (Exception e) {
            notif.eror(e.getMessage()); //Notif eror
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

    public static List<Room> getByType(String type) {
        List<Room> tempData = new ArrayList<>();
        for (Room data : datas) {
            if (data.getType().equalsIgnoreCase(type)) {
                tempData.add(data);
            }
        }
        return tempData;
    }

    //Cetak Data di Output
    @Override
    public void ToString() {
        System.out.println("=== Data Room ===");
        for (Room data : datas) {
            System.out.println("Nomer Kamar :" +  data.getId());
            System.out.println("Type :" + data.getType());
            System.out.println("Harga :" + data.getPrice());
        }
    }
    

}
