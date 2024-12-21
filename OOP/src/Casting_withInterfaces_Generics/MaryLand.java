/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting_withInterfaces_Generics;

/**
 *
 * @author romme
 */

class State extends Region{

    public State() {
    }
    
    public void printMe(){
        System.out.println("Ship it.");
    }
}

class Region extends Place{

    public Region() {
    }
    
    public void printMe(){
        System.out.println("Box it.");
    }
}

class Place extends Object{
    public Place(){
    }
    
    public void printMe(){
        System.out.println("Buy it.");
    }
    
}
public class MaryLand extends State{

    public MaryLand() {
    }
    
    public void printMe(){
        System.out.println("Read it.");
    }
    
    public static void main(String[] args) {
        

        // Region extends Place = State extends Region
        Region mid = new State();
        
        // State extends Region = MaryLand extends State
        State md = new MaryLand();
        
        // Object = Place extends Object
        Object obj = new Place();
        
        // Place extends Object = Region extends Place
        Place usa = new Region();
      
        
        // Object
        // Place     Buy it.
        // Region    Box it.
        // State     Ship it.
        // MaryLand   Read it.
        
        md.printMe(); //  MaryLand  // Output: Read it
        mid.printMe();  // State    // Output: Ship it
        
        // Region ==> Place
        ((Place)obj).printMe(); // Output: Buy it
        
        // Place ==> MaryLand
        obj = md;
        ((MaryLand)obj).printMe(); // Output: Read it
        
        
        // Object Place = Place Region
        // Region ==> Place (Region)
        obj = usa;
        ((Region)obj).printMe(); // Output: Box it
        
        // Place Region = State MaryLand
        // Region ==> Place (MaryLand)
        usa = md;
        ((Place)usa).printMe(); // Output: Read it
        
        
        
    }
    
}
