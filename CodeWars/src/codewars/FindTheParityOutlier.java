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
public class FindTheParityOutlier {
    
    public static void main(String[] args) {
        
        int[] integers = {1, 2};
        int outlier = find(integers);
        if(outlier < 0){
            System.out.println("Array length of atleast 3.");
            return;
        }
        String msg = outlier % 2 != 0? outlier + ": The only odd number." 
                : outlier + ": The only even number.";
        System.out.println(msg);
        
    }
    
    static int find(int[] integers){
        
        if(integers.length < 3)
            return -1;
        
        boolean dominateEven = false;
        // this will hold the number of even and odd numbers
        // for checking the three consecutive elements in the array
        int countEven = 0;
        int countOdd = 0;
        
        for (int i = 0; i < 3; i++) {
            if(integers[i] % 2 == 0) countEven++;
            else countOdd++;
        }
        
        if(countEven > countOdd) dominateEven = true;
        
        for (int i = 0; i < integers.length; i++) {
            // odd
            if(dominateEven && (integers[i] % 2 != 0))
                return integers[i];
            // even
            else if(!dominateEven && (integers[i] % 2 == 0))
                return integers[i];
        }
        
        return 0;
    }
    
}
