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
public class TheFuscFunction {
    
    public static void main(String[] args) {
        System.out.println(fusc(10));
    }
    
    static int fusc(int n){
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        if(n%2==0)
            return fusc(n/=2);
        else
            return fusc((n/2)+1) + fusc(n/=2);
    }
}
