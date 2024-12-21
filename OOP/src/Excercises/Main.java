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
public class Main {
    public static void main(String[] args) {
        
        
//        DiffTwoValueProgression d = new DiffTwoValueProgression();
//        d.printProgression(9);
//        
        
        A a = new A(2);
        C c = new C(4);
        B b = new B(5);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        a  = c.changeValueofA(3);
        
        
        System.out.println("\n");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
