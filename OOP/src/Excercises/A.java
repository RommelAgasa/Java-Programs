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
 class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" + "x=" + x + '}';
    }

}
 class B{
    int x;

    public B(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "B{" + "x=" + x + '}';
    }
    
}

class C{
    int x;

    public C(int x) {
        this.x = x;
    }
    
    public A changeValueofA(int val){
        return new A(val);
    }

    @Override
    public String toString() {
        return "C{" + "x=" + x + '}';
    }
    
    
}


