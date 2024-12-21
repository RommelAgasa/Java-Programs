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
public class GreatestCommonDivision {
    
    public static void main(String[] args) {
        System.out.println(GCD(30, 12));
    }
    
    public static int GCD(int dividend, int divisor){
        int temp = divisor;
        divisor = dividend % divisor;
        dividend = temp;
        if(divisor == 0)
            return temp;
        return GCD(dividend, divisor);
    }
    
}
