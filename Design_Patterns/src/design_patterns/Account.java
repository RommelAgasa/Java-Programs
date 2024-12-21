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
public class Account {
    
    private float balance;
    
    public void deposit(float amount){
        if(amount > 0)
            this.balance += amount;
    }
    
    public void withdraw(float amount){
        if(amount > 0 && this.balance >= amount)
            this.balance -= amount;
    }
    
    public float getBalance(){
        return this.balance;
    }
}
