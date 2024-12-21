/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_Polymorphism;

/**
 *
 * @author romme
 */
public class Progression {
    
    // First value of the progression
    protected long first;
    
    // Current value of the progression
    protected long current;
    
    // Default Constructor

    public Progression() {
        current = first = 1;
    }

    public Progression(long first, long current) {
        this.first = first;
        this.current = current;
    }
    
    
    
    /*Reset the progression to the first value
     @return first value
    */
    protected long firstValue(){
        current = first;
        return current;
    }
    
    /*Advances the progression to the next value
    @return next value of the progression
    */
    protected long nextValue(){
        return ++current;
    }
    
    /*Prints the first n values of the progression
    @param n number of the values to print
    */
    public void printProgression(int n){
        System.out.println(firstValue());
        for(int i = 2; i <= n; i++){
            System.out.print(nextValue());
            System.out.println();
        }
    }

    
}
