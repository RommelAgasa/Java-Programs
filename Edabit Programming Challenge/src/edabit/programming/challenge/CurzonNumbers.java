/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edabit.programming.challenge;

/**
 *
 * @author romme
 */
public class CurzonNumbers {
    
    public static void main(String[] args) {
        System.out.println(isCurzon(10));
    }
    
    public static boolean isCurzon(int num){
        double n = (1 + 2 * num);
        double q = 1 + Math.pow(2, num);
        return (q%n== 0);
    }
    
}
