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
public class CorrectArithmetic {
    
    private int a;
    private int b;
    private int c;

    public CorrectArithmetic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isCorrect(){
        if(a + b == c) return true;
        else if(a == b - c) return true;
        else if(a * b == c) return true;
        
        return false;
    }
    
    
    
}
