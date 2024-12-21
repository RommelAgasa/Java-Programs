/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rommel
 */
public class SquredProductSum {
    
    public static void main(String[] args) {
        
        List<long[]> sumdiff = prod2Sum(2, 3, 4, 5);
        
        for(long[] el : sumdiff) {   
            System.out.print("["+ el[0] + "," + el[1]+ "] ");
        }
        System.out.println("\n");
        
        List<long[]> sumdiff2 = prod2Sum(1, 2, 1, 3);
        
        for(long[] el : sumdiff2) {   
            System.out.print("["+ el[0] + "," + el[1]+ "] ");
        }
        System.out.println("\n");
        
        List<long[]> sumdiff3 = prod2Sum(1, 1, 3, 5);
        
        for(long[] el : sumdiff3) {   
            System.out.print("["+ el[0] + "," + el[1]+ "] ");
        }
    }
    
    public static List<long[]> prod2Sum(long a, long b, long c, long d){
        
        List<long[]> sumdiff = new ArrayList<>();
        
        long diff1 = Math.abs((a * d) - (b * c));
        long sum1 = Math.abs((b * d) + (a * c));
        long sum2 = Math.abs((a * d) + (b * c));
        long diff2 = Math.abs((b * d) - (a * c));
        
        long[] sd1 = {diff1, sum1};
        long[] sd2 = {diff2, sum2};
        
        if(sd1[0] == sd2[0] && sd1[1] == sd2[1]){
            sumdiff.add(sd1);
        }
        else{
            sumdiff.add(sd1);
            sumdiff.add(sd2);
        }
        
        return  sumdiff;
    }
}
