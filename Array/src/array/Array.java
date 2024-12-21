/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author romme
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameEntry game = new GameEntry("Rommel", 12);
        GameEntry game1 = new GameEntry("Tristan", 13);
        GameEntry game2 = new GameEntry("Rebecca", 19);
        
        Score score = new Score();
        
        score.add(game);
        score.add(game2);
        score.add(game1);
        
        score.remove(1);
        
        System.out.println(score.toString());
        
    }
    
}
