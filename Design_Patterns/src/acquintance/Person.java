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
public class Person {
    
    private String name;
    private Bank bank;
    
    public Person(String name, Bank bank){
        this.name = name;
        this.bank = bank;
    }
    
    public String getName(){
        return name;
    }
    
    public Bank getBank(){
        return bank;
    }
    
}
