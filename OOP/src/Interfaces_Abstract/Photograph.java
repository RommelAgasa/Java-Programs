/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces_Abstract;

/**
 *
 * @author romme
 */
public class Photograph implements Sellable{
    
    
    private String desc;    // description of this photo
    private int price;      // the price we are setting
    private boolean color;  // true if photo is color

    public Photograph(String desc, int price, boolean color) {
        this.desc = desc;
        this.price = price;
        this.color = color;
    }
    

    @Override
    public String description() {
        return desc;
    }

    @Override
    public int listPrice() {
        return price;
    }

    @Override
    public int lowestPrice() {
        return price/2;
    }
    
}
