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
public class NotSoRandom {
    
    public static void main(String[] args) {
        
        System.out.println(notSoRandom(1, 1));
        System.out.println(notSoRandom(2, 1));
        System.out.println(notSoRandom(1, 2));
        System.out.println(notSoRandom(2, 2));
        System.out.println(notSoRandom(6, 9));
        System.out.println(notSoRandom(10000, 10000));
        System.out.println(notSoRandom(11111, 22222));
    }
    
    public static String notSoRandom(int b, int w){
        String slastColor = "Black";
        int isumOfMarbles = b + w;
        int iwhite = 0;
        int iblack = 0;
        
        while(isumOfMarbles > 1){
            
            // if black marbles is zero add the accumulated black marbles
            if(w <= 1 && iwhite != 0){
                w += iwhite;
                iwhite = 0; // set zero to iwhite for the next accumulating
            }
            
            // if black marbles is zero add the accumulated black marbles
            if(b <= 1 && iblack != 0){
                b += iblack;
                iblack = 0; // set zero to iblack for the next accumulating
                
            }

            // removed marbles
            // both marbles is not equal to zero
            if(b != 0 && w != 0){
                b--;
                w--;
                iblack++; // Black | White = Black++; 
                isumOfMarbles--;
            }
            
            // black marbles is zero
            else if(b == 0 && w >= 2){
                w -= 2;
                isumOfMarbles--;
                iwhite++;
            }
            // white marble is zero
            else if(b >= 2 && w == 0){
                b -= 2;
                isumOfMarbles--;
                iwhite++;
            }
            
        }
        
        w = iwhite;
        b = iblack;
        if(b == 0 && w == 1) slastColor = "White";

        return slastColor;
    }
}
