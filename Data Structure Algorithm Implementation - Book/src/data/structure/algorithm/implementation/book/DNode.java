/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.algorithm.implementation.book;

/**
 *
 * @author romme
 */
public class DNode {
    
    protected String element;
    protected DNode prev, next;

    public DNode(String element, DNode prev, DNode next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public String getElement(){
        return element;
    }
    
    public DNode getPrev(){
        return prev;
    }
    
    public DNode getNext(){
        return next;
    }
    
    public void setElement(String newValue){
        element = newValue;
    }
    
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }
    
    public void setNext(DNode newNext){
        next = newNext;
    }
}
