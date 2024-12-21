/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.and.algorithm.LinkedList;

/**
 *
 * @author romme
 */
public class DNode {
    
    protected String element;
    protected DNode next, prev;

    public DNode(String element, DNode next, DNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
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
    
    public void setElement(String newElement){
        element = newElement;
    }
    
    public void setPrev(DNode newPrev){
        prev = newPrev;
    }
    
    public void setNext(DNode newNext){
        next = newNext;
    }
}
