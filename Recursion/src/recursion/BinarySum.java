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
public class BinarySum {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySum(arr));
    }
    
    public static int binarySum(int[] arr){
        return helper(arr, 0, arr.length);
    }
    
    public static int helper(int[] arr, int i, int n){
        if(n == 1) return arr[i];
        return helper(arr, i, (n/2)) + helper(arr, i + (n/2), (n/2));
    }

}
