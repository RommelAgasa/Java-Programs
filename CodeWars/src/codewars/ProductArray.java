/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.Arrays;

/**
 *
 * @author rommel
 */
public class ProductArray {
    
    
    public static void main(String[] args) {
        int[] trial = {1, 2};
        
        int[] prodArray = productArray(trial);
        
        System.out.println(Arrays.toString(prodArray));
    }
    
    public static int[] productArray(int[] arr){
        int[] prod = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            prod[i] = productOfAllElementExceptTheCurrentElement(arr, i);
        }
        
        return prod;
    }
    
    public static int 
        productOfAllElementExceptTheCurrentElement
                    (int[] arr, int currentIndex){
        int product = 1;
        int length = arr.length;
        
        if(currentIndex == length-1) length-=1;
        
        for(int i = 0; i < length; i++){
            if(currentIndex == i) i++;
            product *= arr[i];
        }
        return product;
    }
    
}
