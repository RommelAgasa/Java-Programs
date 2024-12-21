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
public class LongestPalindrome {
    
    public static void main(String[] args) {
        System.out.println(longest_palindrome
        ("zzbaabcd"));
    }
    
    public static int longest_palindrome(String s){
        
        int longestPalin = 0;
        int hold = 0;
        char[] tempStringArray = new char[s.length()];
        
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        for(int i = 0; i < s.length(); i++){
            tempStringArray[i] = s.charAt(i);
            hold = checkPalin(tempStringArray, 
                    longestPalin, i, 0);
            
            if(hold > longestPalin){
                longestPalin = hold;
            }
        }
        
        return longestPalin;
    }
    
    public static int checkPalin
        (char[] ch, int longestPalin, int size, int index){
            
        int hold = 0;
        if(ch.length == 1) return 1;
        if(index >= size) return longestPalin;
        int start = index;
        int last = size;
        while(last >= start){
            if(last == start && ch[start] == ch[last])
                hold += 1;
            else if(ch[start] == ch[last]){
                hold += 2;
            }
            last--;
            start++;
        }
        
        if(hold > longestPalin)
           longestPalin = hold;
        
        index++;
        return checkPalin(ch, longestPalin, size, index);
    }
        

}
