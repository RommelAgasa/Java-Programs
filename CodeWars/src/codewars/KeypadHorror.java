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
public class KeypadHorror {
    
    public static void main(String[] args) {
        System.out.println(computerToPhone("359"));
    }
    
    public static String computerToPhone(String str){
        String toKeypad = "";
        
        char[][] keypad = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
        };
        
        char[][] com = {
           {'7', '8', '9'},
           {'4', '5', '6'},
           {'1', '2', '3'}
        };
        
        for(int i = 0; i < str.length(); i++){
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    if(str.charAt(i) == com[row][col]){
                        toKeypad += keypad[row][col];
                    }
                }
            }
        }
        return toKeypad;
    }
}
