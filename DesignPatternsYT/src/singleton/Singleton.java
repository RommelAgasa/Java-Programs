/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author romme
 */
public class Singleton {
    
    
    // volatile means that a value could change over time, 
    // outside of the control of some code.
    private static volatile Singleton instance;
    private String data;
    
    private Singleton(String data){
        this.data = data;
    }
    
    public static Singleton getInstance(String data){
        Singleton result = instance;
        
        if(result == null){
            synchronized(Singleton.class){
                result = instance;
                if(result == null){
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
