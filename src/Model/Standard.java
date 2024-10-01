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
public class Standard extends Room{

    public Standard(int id, String type, double price) {
        super(id, type, price);
    }

    public Standard() {
    }

    //Method Final untuk harga dan type kamar
    @Override
    public final double getPrice() {
        return 150000; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final String getType() {
        return "Standard"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
