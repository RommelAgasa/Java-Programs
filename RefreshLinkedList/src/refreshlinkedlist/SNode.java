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
public class SNode<T> {
    
    private T val;
    private SNode next;
    
    public SNode(T val){
        this.val = val;
        this.next = null;
    }
    
    public T getValue(){
        return val;
    }
    
    public SNode getNext(){
        return next;
    }
    
    public void setNext(SNode node){
        this.next = node;
    }
    
    public void setValue(T newVal){
        this.val = newVal;
    }
}
