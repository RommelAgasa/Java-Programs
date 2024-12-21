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
public class Score {
    
    String name;
    protected int numEntries;
    public static final int MAXENTRIES = 10;
    protected GameEntry[] entries;

    public Score() {
        entries = new GameEntry[MAXENTRIES];
        numEntries = 0;
    }
    
    
    public void add(GameEntry e){
        
        if(numEntries == MAXENTRIES){
            if(e.getScore() <= entries[numEntries-1].getScore())
                return;
        }

        numEntries++;
        int i = numEntries-1;
        for(; (i >= 1) && e.getScore() > entries[i-1].getScore(); i--){
            entries[i] = entries[i-1];
        }
        entries[i] = e;

    }
    
    public void remove(int index){
        
        if(numEntries == 0 || index < 0 || index > numEntries -1) return;
        
        boolean start = false;
        for(int i = index; i < numEntries - 1; i++){
            entries[i] = entries[i+1];
        }
        
        numEntries--;
        
    }
    

    @Override
    public String toString() {
        String s = "[";
        for(int i = 0; i < numEntries; i++){
            s += entries[i] + ", ";
        }
        return s + "]";
    }

    
    
}
