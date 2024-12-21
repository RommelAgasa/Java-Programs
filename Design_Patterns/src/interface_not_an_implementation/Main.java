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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creational patterns ensure that your systems written in terms ofinterfaces, not implementations
        Application winApp = new Application(new WinFactory());
        winApp.createUI();
    }
    
}
