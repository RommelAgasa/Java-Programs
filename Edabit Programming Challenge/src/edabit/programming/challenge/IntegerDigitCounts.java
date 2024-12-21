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
public class IntegerDigitCounts {
    
    public static void main(String[] args) {
        System.out.println(count(-92563));
    }
    
    
    public static int count(int num){
        return helper(num, 0);
    }
    
    public static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        count++;
        num = (num - (num % 10)) / 10;
        return helper(num, count);
        
    }
}
