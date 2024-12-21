/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegation;

/**
 *
 * @author romme
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /**
         * NOTE: Dynamic, highly parameterized software is harder
                to understand than more static software.
         */
        
        Engine dieselEngine = new DieselEngine();
        Engine petrolEngine = new PetrolEngine();
        
        Car dieselCar =  new Car("Diesel Car", dieselEngine);
        dieselCar.start();
        dieselCar.stop();
        
        System.out.println();
        
        Car petrolCar = new Car("Petrol Car", petrolEngine);
        petrolCar.start();
        petrolCar.stop();
    }
    
}
