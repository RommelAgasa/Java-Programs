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
public class LargestGap {
    
    public static void main(String[] args) {
        int[] a = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
        
        System.out.println(largestGap(a));
    }
    
    //  In Java, you cannot pass variables by reference, but when you pass an object 
    // (including arrays), you are passing a reference to that object, which allows you to modify the object's content.
    public static int largestGap(int[] arr){
        int gap = 0;
        
        // Sort the array
        sortArray(arr);
        
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i] - arr[i-1];
            if(temp > gap){
                gap = temp;
            }
        }
        return gap;
    }
    
    public static void sortArray(int[] arr){
        
        for(int i = 0; i < arr.length; i++){
            for(int y = 1; y < (arr.length-i); y++){
                if(arr[y-1] > arr[y]){
                    // swap
                    int temp = arr[y-1];
                    arr[y-1] = arr[y];
                    arr[y] = temp;
                    
                }
            } // end inner loop
            
        } // end outer loop        
    }
}
