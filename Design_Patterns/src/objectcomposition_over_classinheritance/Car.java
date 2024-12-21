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
public class Car {
    
    private final String model;
    private final Engine engine;
    
    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }
    
    public void start(){
        System.out.println("Starting " + model + " car");
        engine.start();
    }
    
    public void stop(){
        System.out.println("Stopping " + model + " car");
        engine.stop();
    }
}
