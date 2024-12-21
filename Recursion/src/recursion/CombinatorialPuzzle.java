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
public class CombinatorialPuzzle {
    
    public static void main(String[] args) {
        String[] S = new String[3];
        String[] U = {"a", "b", "c"};
        puzzleSolve(3, S, U);
    }
    
    public static String puzzleSolve(int k, String[] S, String[] U){
        
        for(int i = 0; i < U.length; i++){
            // Remove e from U {e is now being used}
            // Add e to end of S
           
            S[i] = removed(U, i);
            System.out.println(toString(U));
            
            
        }
        
        return "s";
        
    }
    
    public static String removed(String[] u, int i){
        String e = u[i];
        i += 1;
        for(int j = 0 ; i < u.length; j++, i++)
             u[j] = u[i];

        u[--i] = null;
       return e;
    }
    
    public static String toString(String[] s){
        String str = "[ ";
        for(int i = 0; i < s.length; i++){
            str += s[i] + " ";
        }
        return str + "]";
    }
    
    public static boolean password(String[] com){
        
        String[] pass = {"a", "c", "b"};
        for(int i = 0; i < pass.length; i++)
            if(pass[i] != com[i]) return false;
        return true;
    }
}
