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
public class FindOtherTwoSideLengths {
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(longestMediumSide(2)));
    }
    
    public static double [] longestMediumSide(int side){
        
        double [] otherSide = new double[2];
        double a = (2*side);
        String hypotenuse = String.format("%.2f", a);
        otherSide[0] = Float.parseFloat(hypotenuse); // hypotenuse
        String s = String.format("%.2f", (side * (Math.sqrt(3))));
        otherSide[1] = Double.parseDouble(s);
        
        return otherSide;
    }
}
