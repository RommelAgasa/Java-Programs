/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author romme
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {
        
        
        The_Caesar_Cipher w = new The_Caesar_Cipher();
        
        
        String encrypt = w.encrypt("No pain, No gain!");
        String decrypt = w.decrypt(encrypt);
        
        System.out.println(encrypt);
        System.out.println(decrypt);

    }
    
}
