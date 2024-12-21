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
public class CapitalizeAllVowels {
    
    public static void main(String[] args) {
        
        System.out.println(capAllVowels("Hello World"));
        System.out.println(capAllVowels("i love entrepreneurship"));
    }
    
    public static String capAllVowels(String str){
        String capitalizeString = "";
        
        for(int i = 0; i < str.length(); i++){
            if(isVowel(str.charAt(i)))
                capitalizeString += Character.toUpperCase(str.charAt(i));
            else
                capitalizeString += str.charAt(i);
        }
        return capitalizeString;
    }
    
    public static boolean isVowel(char ch){
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < vowel.length; i++)
            if(ch == vowel[i]) return true;
        
        return false;
    }
}
