/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcomposition_over_classinheritance;

/**
 *
 * @author romme
 */
public class Engine {
    private final String type;
    
    public Engine(String type){
        this.type = type;
    }
    
    public void start(){
        System.out.println("Starting " + type + " engine.");
    }
    
    public void stop(){
        System.out.println("Stopping " + type + " engine.");
    }
    
}
