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
public class BetweenExtreme {
    
    public static void main(String[] args) {
        int[] numbers = {1, 434, 555, 34, 112};
        System.out.println(betweenExtreme(numbers));
    }
    
    public static int betweenExtreme(int [] numbers){
        
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > largest)
                largest = numbers[i];

             if(numbers[i] < smallest)
                smallest = numbers[i];
        }
   
        return (largest-smallest);
    }
    
}
