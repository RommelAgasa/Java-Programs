/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refreshlinkedlist;

/**
 *
 * @author rommel
 */
public class DNode<T> {
    
    private T value;
    private DNode next, prev;
    
    public DNode(T val, DNode nextNode, DNode prevNode){
        this.value = val;
        this.next = nextNode;
        this.prev = prevNode;
    }
    
    public void setValue(T value){
        this.value = value;
    }
    
    public void setNext(DNode nodeNext){
        this.next = nodeNext;
    }
    
    public void setPrev(DNode nodePrev){
        this.prev = nodePrev;
    }
    
    public T getValue() { return value; }
    
    public DNode getNext() { return next; }
    
    public DNode getPrev() { return prev; }
    
}
