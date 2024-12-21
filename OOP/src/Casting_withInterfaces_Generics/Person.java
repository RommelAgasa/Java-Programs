/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting_withInterfaces_Generics;

/**
 *
 * @author romme
 */
public interface Person {
    
    public boolean equalTo(Person other);   // is the same person?
    public String getName();    // get the name of this person
    public int getAge();        // get the person's age
    
}
