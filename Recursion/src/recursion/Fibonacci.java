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
public class Fibonacci {
    
    // 1 1 2 3 5 8 13 21
    public static void main(String[] args) {
        fibo(8);
    }
    
    public static void fibo(int n){
        if(n == 0) return;
        helper(n, 0, 1);
    }
    
    public static  void helper(int n, int prev, int current){
        System.out.print(current + " ");
        int temp = prev;
        prev = current;
        current += temp;
        if(n > 1)
            helper((n-=1), prev, current);

    }
}
