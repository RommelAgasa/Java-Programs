/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author rommel
 */
public class DigPow {
    
    public static void main(String[] args) {
        
        System.out.println(digPow(92, 1));
    }
    
    public static int digPow(int n, int p){
        int sum = 0;
        int holdP = p;
        int holdN = n;
        
        n = reverse(n); 
        while(n != 0 && (p <= (p+p))){
            sum += Math.pow((n % 10), p);
            n /= 10;
            p++;
        }

        if((sum == (holdN*holdP))) return holdP;
        
        return -1;
    }
    
    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
    
}
