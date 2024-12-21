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
public class MailService {
    
    public void sendEmail(){
        connect(1);
        authenticate();
        // Send email
        disconnect();
    }
    
    private void connect(int timeout){
        System.out.println("Connect");
    }
    
    private void disconnect(){
        System.out.println("Disconnect");
    }
    
    private void authenticate(){
        System.out.println("Authenticate");
    }
}
