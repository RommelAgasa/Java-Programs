/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author rommel
 */
public class DecimalToBinaryViceVersa {
    
    public static void main(String[] args) {
        long binary = decimalConvertToBinary(3);
        long decimal = binaryToDecimal(binary);
        System.out.println(binary);
        System.out.println(decimal);
    }
    
    public static long decimalConvertToBinary(int n){
        if(n == 0)
            return 0;
        return (decimalConvertToBinary(n/2) * 10) + (n%2);
    }
    
    public static long binaryToDecimal(long binary){
        return helper(binary, 0);
    }
    
    public static long helper(long binary, int exp){
        if(binary == 0) return 0;
        if((binary%2) != 0) 
            return (long)Math.pow(2, exp) + helper((binary/10), (exp += 1));
        return helper((binary/10), (exp += 1));
    }
}
