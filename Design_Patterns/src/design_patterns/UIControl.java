/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns;

/**
 *
 * @author romme
 */
public abstract class UIControl {
    
    public void enable(){
        System.out.println("Enabled");
    }
    
    public abstract void draw();
}
