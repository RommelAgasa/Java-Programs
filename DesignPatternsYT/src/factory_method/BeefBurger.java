/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory_method;

/**
 *
 * @author romme
 */
public class BeefBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing beef burger.");
    }
    
}
