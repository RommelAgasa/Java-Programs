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
public class Xbonacci {
    
    public static void main(String[] args) {
        double[] sig = {1,1,1};
        System.out.println(Arrays.toString(tribonacci(sig, 9)));

    }
    
    public static double[] tribonacci(double[] s, int n){
        double[] temp = new double[n];
        double first = s[0];
        double second = s[1];
        double current = s[2];
        
        for(int i = 0; i < n; i++){
            if(i <= 2){
                temp[i] = s[i];
            }
            else{
                temp[i] = current + second + first;
                first = second;
                second = current;
                current = temp[i];
            }
        }
        
        return temp;
    }
}
