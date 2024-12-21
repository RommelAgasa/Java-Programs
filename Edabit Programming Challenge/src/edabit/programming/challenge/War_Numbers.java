/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edabit.programming.challenge;

/**
 *
 * @author romme
 */
public class War_Numbers {
    
    public static void main(String[] args) {
        
        int[] a = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println(great(a));
    }
    
    public static int great(int[] a){
        int diff = 0;
        int sumEven  = 0;
        int sumOdd = 0;
        
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                sumEven += a[i];
            }
            else {
                sumOdd += a[i];
            }
        }
        
        if(sumEven > sumOdd){
            diff = sumEven - sumOdd;
            return  diff;
        }
        
        diff = sumOdd - sumEven;
        return diff;
    }
    
}
