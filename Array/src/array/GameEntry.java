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
public class GameEntry {
    
    protected String name;
    protected int score;

    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GameEntry[" + "name = " + name + ", score = " + score + ']';
    }
    
    
    
    
    
    
    
    
    
}
