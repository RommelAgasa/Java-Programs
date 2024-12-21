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
public class Node {
    public String element;
    public Node next;
    
    // Create a node with the given element and and next node
    public Node(String newVal){
        element = newVal;
        next = null;
    }
    
    // Return the elements of this node
    public String getElement(){
        return this.element;
    }
    
    // Return the next node of this node
    public Node getNextNode(){
        return next;
    }
    
    // Modifier methods
    // Sets the element of this node
    public void setElement(String newElement){
        this.element = newElement;
    }
    // Sets the next node of this node
    public void setNext(Node newNext){
        this.next = newNext;
    }
}
