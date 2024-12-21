/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_Polymorphism;

/**
 *
 * @author romme
 */
public class Main {
    public static void main(String[] args) {
        
//        Progression progression = new Progression();
//        System.out.println(progression.current);
//        System.out.println(progression.nextValue());
//        System.out.println(progression.nextValue());
//        System.out.println(progression.nextValue());
//        System.out.println();
//        progression.printProgression(3);
//        
//        ArithProgression arithProgression = new ArithProgression(2);
//        System.out.println(arithProgression.nextValue());
//        System.out.println(arithProgression.nextValue());
//        System.out.println(arithProgression.nextValue());
//        System.out.println(arithProgression.nextValue());
//        System.out.println(arithProgression.nextValue());
//        System.out.println();
//        arithProgression.printProgression(5);
        
        Progression p = new GeomProgression();
        
        System.out.print(p.firstValue());
        System.out.println();
        
        
        
    }
}
