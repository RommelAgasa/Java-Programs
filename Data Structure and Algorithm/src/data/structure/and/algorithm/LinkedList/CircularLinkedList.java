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
public class CircularLinkedList {
    
    private int size;
    private Node cursor;

    public CircularLinkedList() {
        this.size = 0;
        this.cursor = null;
    }
    
    // Returns the size of the list
    public int getSize(){
        return size;
    }
    
    // Returns wether the list is empty
    public boolean isEmpty(){
        return size == 0;
    }
    
    // Returns cursor node
    public Node getCursor(){
        return cursor;
    }
    
    // add new node to the list
    // NOTE: the newNode is always added after the cursor
    public void add(Node v){
        if(cursor == null) {
            cursor = v;
            cursor.setNext(v);
            size++;
            return;
        }
        v.setNext(cursor.getNextNode());
        cursor.setNext(v);
        size++;
    }
    
    // remove the node that is, cursor.getNextNode()
    // cursor => Node1 => Node2 => cursor
    public Node remove(){
        Node oldNode = cursor.getNextNode();
        if(oldNode == cursor) {
            cursor = null;
            size--;
            return oldNode;
        }
        cursor.setNext(oldNode.getNextNode());
        oldNode.setNext(null);
        size--;
        return oldNode; 
    }
    
    // advance the cursor
    public void advance(){
        cursor = cursor.getNextNode();
    }
    
    public String toString(){
        if(cursor == null)
            return "List is empty.";
        Node c = cursor.getNextNode();
        String s = "[";
        while(c != cursor){
            s += c.getElement() + ", ";
            c = c.getNextNode();
        }
        return s += c.getElement() + "]";
    }
    
    
}
