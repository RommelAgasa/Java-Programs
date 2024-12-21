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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create an engine
        Engine dieselEngine = new Engine("diesel");
        
        // Create a car
        Car dieselCar = new Car("Diesel Car", dieselEngine);
        
        // Start
        dieselCar.start();
        dieselCar.stop();
    }
    
}
