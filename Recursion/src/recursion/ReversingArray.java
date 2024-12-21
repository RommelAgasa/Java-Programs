/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author romme
 */
public class ReversingArray {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4};
        
        reverse(arr, 0, arr.length-1);
        
        for(int n = 0; n < arr.length; n++){
            System.out.print(arr[n] + " ");
        }
        System.out.println();
    }
    
    public static void reverse(int [] arr, int i, int j){
        
        if(i == (arr.length/2)) return;
        swapp(i, j, arr);
        reverse(arr, ++i, --j);
    }

    private static void swapp(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
