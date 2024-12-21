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
public class DoubleLinkedList {
    
    protected int size;                 // number of elements
    protected DNode header, trailer;    // sentinels

    public DoubleLinkedList() {
        size = 0;
        header = new DNode(null, null, null);   // create header
        trailer = new DNode(null, header, null);    // create trailer
        header.setNext(trailer);       // make header and trailer point to each other
    }
    
    // Returns the number of elements
    public int getSize(){
        return size;
    }
    
    // Returns wether the list is empty
    public boolean isEmpty(){
        return (size == 0);
    }
    
    // Returns the first node of the list
    public DNode getFirst(){
        if(isEmpty()) throw new IllegalStateException("List is empty.");
        return header.getNext();
    }
    
    // Returns the last node of the list
    public DNode getLast(){
        if(isEmpty()) throw new IllegalStateException("List is empty.");
        return trailer.getPrev();
    }
    
    // Returns the node before the given node
    public DNode getPrev(DNode v){
        if(v == header) throw new IllegalArgumentException("Cannot move back past the header of the list.");
        return v.getPrev();
    }
    
    // Returns the node after the given node
    public DNode getNext(DNode v){
        if(v == trailer) throw new IllegalArgumentException("Cannot move forward past the trailer of the list.");
        return v.getNext();
    }
    
    // Insert the given node z before the given node v
    public void addBefore(DNode v, DNode z) throws IllegalArgumentException{
        DNode u = getPrev(v);
        z.setPrev(u);
        z.setNext(v);
        v.setPrev(z);
        u.setNext(z);
        size++;
    }
    
    // Insert the given node z after the given node v.
    public void addAfter(DNode v, DNode z) throws IllegalArgumentException {
        DNode w = getNext(v);
        z.setPrev(v);
        z.setNext(w);
        w.setPrev(z);
        v.setNext(z);
        size++;
    }
    
    // Insert the given node at the head of the list
    public void addFirst(DNode v){
        addAfter(header, v);
    }
    
    // Insert the given node at the tail of the list
    public void addLast(DNode v){
        addBefore(trailer, v);
    }
    
    // Remove the given node from the list
    public void remove(DNode v){
        DNode u = getPrev(v);
        DNode w = getNext(v);
        u.setNext(w);
        w.setPrev(u);
        v.setNext(null);
        v.setPrev(null);
    }
    
    // Returns wether a given node has a previous node
    public boolean hasPrev(DNode v){
        return (v != header);
    }
    
    // Returns wether a given node has a next node
    public boolean hasNext(DNode v){
        return (v != trailer);
    }
    
    // Returns string representation of the list
    public String toString(){
        String s = "[";
        DNode v = header.getNext();
        while( v != trailer){
            s += v.getElement() + ", ";
            v = v.getNext();
        }
        s += "]";
        return s;
    }
    
}
