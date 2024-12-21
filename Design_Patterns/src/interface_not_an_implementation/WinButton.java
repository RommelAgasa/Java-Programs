/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_not_an_implementation;

/**
 *
 * @author romme
 */
public class WinButton implements Button{

    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
    
}
