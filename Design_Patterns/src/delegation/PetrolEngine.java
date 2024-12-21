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
public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting petrol Engine.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping petrol Engine.");
    }
    
}
