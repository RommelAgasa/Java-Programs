/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercises;

/**
 *
 * @author romme
 */
public class DiffTwoValueProgression extends Progression{
    
    long prev;

    public DiffTwoValueProgression() {
        this.first = 2;
        this.current = 200;
        this.prev = 2;
    }
    
    DiffTwoValueProgression(long first, long current, long prev){
        super(first, current);
        this.prev = prev;
    }
    
    // 2 200 198, 
    
    @Override
    protected long nextValue() {
        // difference between the previous two values
        long temp = current;
        current = Math.abs(prev - current);
        prev = temp;
        return current;
    }

    @Override
    public void printProgression(int n) {
        System.out.println(first);
        for(int i = 0; i < n-1; i++){
            System.out.println(this.nextValue());
        }
    }

    
}
