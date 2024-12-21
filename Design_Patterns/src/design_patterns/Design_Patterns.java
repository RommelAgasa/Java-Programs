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
public class Design_Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Loose Coupling
//       TaxCalculator calculator = getCalculator();
//       calculator.calculateTax();

        //-----------------------------------------------
        // Encapsulation
//        var account = new Account();
//        account.deposit(10);
//        account.withdraw(10);
//        System.out.println(account.getBalance());
        
        // ----------------------------------------------
        // Abstraction
//        var mailService = new MailService();
//        mailService.sendEmail();

        // ----------------------------------------------
        // Inheritance
//        var textBox = new TextBox();
//        textBox.enable();

        // ----------------------------------------------
        // Polymorphism
        drawIUControl(new TextBox());
    }
    
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2019();
    }
    
    public static void drawIUControl(UIControl control){
        control.draw();
    }
    
}
