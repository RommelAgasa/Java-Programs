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
public class CountLetterInAWordSearch {
    
    public static void main(String[] args) {
        String[][] arr = {
            {"D", "E", "Y", "H", "A", "D"},
            {"C", "B", "Z", "Y", "J", "K"},
            {"D", "B", "C", "A", "M", "N"},
            {"F", "G", "G", "R", "S", "R"},
            {"V", "X", "H", "A", "S", "S"}
        };
        System.out.println(count(arr, "D"));
    }
    
    public static int count(String[][] letter, String search) {
         
        int countOfLetter = 0;
        
        for(int row = 0; row < letter.length; row++){
            for(int col = 0; col < letter[0].length; col++){
                if(search == letter[row][col]){
                    countOfLetter++;
                }
            }
        }
        
        return countOfLetter;
    }
    
}
