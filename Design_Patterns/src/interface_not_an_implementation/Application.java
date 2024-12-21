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
public class Application {
    
    private final GUIFactory factory;
    
    public Application(GUIFactory factory){
        this.factory = factory;
    }
    
    public void createUI(){
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        button.paint();
        checkbox.paint();
    }
}
