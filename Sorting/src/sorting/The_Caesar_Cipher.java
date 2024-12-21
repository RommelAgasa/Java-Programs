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
public class The_Caesar_Cipher {
    
    private static final int ALPHASIZE = 26;
    private char[] encrypt = new char[ALPHASIZE];
    private char[] decrypt = new char[ALPHASIZE];
    private static final char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; 

    public The_Caesar_Cipher(){
        for(int i = 0; i < ALPHASIZE; i++)
            encrypt[i] = alpha[(i+3)%ALPHASIZE];
        for(int i = 0; i < ALPHASIZE; i++)
            decrypt[encrypt[i] - 'A'] = alpha[i];
    }
    
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    // DEFGHIJKLMNOPQRSTUVWXYZABC - Encrypt
    // XYZABCDEFGHIJKLMNOPQRSTUVW - Decrypt
    public String encrypt(String plain){
        
        char[] mess = plain.toUpperCase().toCharArray();
        
        for(int i = 0; i < mess.length; i++)
            if(Character.isUpperCase(mess[i]))
                mess[i] = encrypt[mess[i] - 'A'];
        return new String(mess);
    }
    
    public String decrypt(String secret){
        char[] mess = secret.toUpperCase().toCharArray();
        
        for(int i = 0; i < mess.length; i++)
            if(Character.isUpperCase(mess[i]))
                mess[i] = decrypt[mess[i] - 'A'];
        return new String(mess);
    }
}
