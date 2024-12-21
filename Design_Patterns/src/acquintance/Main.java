/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acquintance;

/**
 *
 * @author romme
 */
public class Main {

    /**
     * Acquaintance represents a "knows-about" relationship, 
     * where one class knows about another class, but they are 
     * not directly related in terms of containment or ownership.
     */
    public static void main(String[] args) {
        
        // Create a bank
        Bank bank =  new Bank("ABC Bank");
        
        // Create person
        Person person = new Person("Jhon", bank);
        
        // Access person's bank
        Bank personBank = person.getBank();
        System.err.println(person.getName() + " banks with " + personBank.getName());
    }
    
}
