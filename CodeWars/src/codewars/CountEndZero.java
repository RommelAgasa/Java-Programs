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
public class CountEndZero {
    
    public static void main(String[] args) {
        
        System.out.println(countEndZero(32));
        System.out.println("\n");
        for(int i = 0; i <= 100; i++){
            System.out.println(i + " " + product(i));
        }
    }
    
    public static int countEndZero(int n){
        int zero = 0;
        boolean isEven = n % 2 == 0 ? true: false;
        
        for(int i = 1; i <= n; i++){
            if(isEven && (i % 2 == 0)){
                if(i%10 == 0) zero++;
            }
        }
        return zero;
    }
    
     public static long product(int n){
        long  product = 1;
        boolean isEven = n % 2 == 0 ? true: false;
        
        for(int i = 1; i <= n; i++){
            if(isEven && (i % 2 == 0)){
                product *= i;
            }
            else if (!isEven && (i % 2 != 0))
                product *= i;
        }
        return product;
    }

    
}
