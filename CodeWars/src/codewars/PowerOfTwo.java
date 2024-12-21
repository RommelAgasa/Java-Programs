/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author romme
 */
public class PowerOfTwo {
    
    /*
    No, being divisible by two does not necessarily mean that a number is 
    a power of two. A power of two is a number of the form 2^n, where n is a 
    non-negative integer. While all powers of two are divisible by two, not 
    all numbers divisible by two are powers of two. For example, 6 is divisible 
    by two but is not a power of two.
    
    1, 2, 4, 8, 16, 32, 64, 128, 256, 512
    */
    
    public static void main(String[] args) {
        
        System.out.println(isPowerOfTwo(-16));
    }
    
    public static boolean isPowerOfTwo(int n){
        if (n <= 0) {
        return false;
    }
    return (n & (n - 1)) == 0;
    }
    
}
