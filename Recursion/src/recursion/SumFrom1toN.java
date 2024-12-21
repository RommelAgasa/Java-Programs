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
public class SumFrom1toN {
    
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
    public static int sum(int n){
        return helper(0, n);
    }
    
    public static int helper(int sum, int n){
        if(n == 0){
            return sum;
        }
        sum += n;
        return helper(sum, n-1);
    }
}
