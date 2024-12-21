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
public interface Sellable {
    
    // descriptio of the object
     public String description();
    
     // list price in cents
     public int listPrice();
     
     // lowest price in cents we will accept
     public int lowestPrice();

}
