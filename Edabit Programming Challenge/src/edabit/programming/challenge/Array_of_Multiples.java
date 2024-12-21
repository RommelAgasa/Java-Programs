/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edabit.programming.challenge;

import java.util.Arrays;

/**
 *
 * @author romme
 */
public class Array_of_Multiples {
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(array_multiples(7, 5)));
    }
    
    public static int[] array_multiples(int number, int length){
        int[] multiple = new int[length];
        
        for(int i = 0; i < length; i++){
            multiple[i] = number * (i+1);
        }
        
        return multiple;
    }
}
