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
public class VeggieBurgerRestaurant extends Restaurant{

    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
    
}
