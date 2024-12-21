/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.and.algorithm.LinkedList;

import java.util.Collections;

/**
 *
 * @author romme
 */
public class DoublyLinkedList {
    private int size;
    private DNode header, trailer;

    //String element, DNode next, DNode prev
    public DoublyLinkedList() {
        size = 0;
        header = new DNode("header", null, null);
        trailer = new DNode("trailer", null, header);
        header.setNext(trailer);
    }
    
    // getSize
    public int getSize(){
        return size;
    }
    
    // isEmpty
    public boolean isEmpty(){
        return size == 0;
    }
    
    // getLast
    public DNode getLast(){ 
        if(isEmpty()) throw new IllegalStateException("List is empty.");
        return trailer.getPrev();
    }
    
    // getFirst
    public DNode getFirst(){
        if(isEmpty()) throw new IllegalStateException("List is empty.");
        return header.getNext();
    }
    
    // getPrev
    public DNode getPrev(DNode v){
        if(v == header) throw new IllegalArgumentException("Cannot move back past the header of the list.");
        return v.getPrev();
    }
    
    // getNext
    public DNode getNext(DNode v){
        if(v == trailer) throw new IllegalArgumentException("Cannot move forward past the trailer of the list.");
        return v.getNext();
    }
    
        // addFirst
    public void addFirst(DNode v) throws IllegalArgumentException{
        addAfter(header, v);
    }
    
    // addLast
    public void addLast(DNode v) throws IllegalArgumentException{
        addBefore(trailer, v);
    }
    
    // addBefore - Insert the given node z before the given node v
    public void addBefore(DNode v, DNode z){
        DNode u = getPrev(v);
        u.setNext(z);
        z.setPrev(u);
        z.setNext(v);
        v.setPrev(z);
        size++;
    }
    
    // addAfter - Insert the given node z after the given node v
    public void addAfter(DNode v, DNode z){
        //  v z u
        DNode u = getNext(v);
        v.setNext(z);
        z.setPrev(v);
        z.setNext(u);
        u.setPrev(z);
        size++;
    }
    
    // remove
    public void remove(DNode v){
        DNode u = getPrev(v);
        DNode w = getNext(v);
        u.setNext(w);
        w.setPrev(u);
        v.setNext(null);
        v.setPrev(null);
        size--;
    }
    
    public void reverse(DoublyLinkedList list){
        helper(list.getFirst(), list.getLast(), list);
    }
    
    public DNode helper(DNode cur, DNode last, DoublyLinkedList list){
        
        if(cur == last){
            list.header.setNext(cur);
            cur.setPrev(list.header);
            return cur;
        }
        addAfter(helper(cur.getNext(), last, list), cur);
        return cur;
    }
    
    // hasPrev
    public boolean hasPrev(DNode v){
        return (v != header);
    }
    
    // hasNext
    public boolean hasNext(DNode v){
        return (v != trailer);
    }
    
    // toString
    public String toString(){
        DNode v = header.getNext();
        String s = "[ ";
        while(v != trailer){
            s += v.getElement() + " ";
            v = v.getNext();
        }
        return s += "]";
    }
    
}
