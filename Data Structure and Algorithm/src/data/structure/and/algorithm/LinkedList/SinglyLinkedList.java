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
public class SinglyLinkedList {
    
    protected Node head;    // Head node of the list
    protected Node tail;
    protected long size;    // number of node in the list

    public SinglyLinkedList() {
        tail = null;
        head = null;
        size = 0;
    }
    
    public void addFirst(Node newHead){
        if(head == null){
            head = newHead;
            head.next = null;
            tail = head;
            return;
        }
        
        newHead.setNext(head);
        head = newHead;
        size += 1;
    }
    
    public void addLast(Node newTail){
        newTail.setNext(null);
        tail.setNext(newTail);
        tail = newTail;
        size +=1;
    }
    
    
    public void removeFirst(){
        if(head == null ) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        head = head.getNextNode();
        temp.setNext(null);
        size -= 1;
    }
    
    public void display(){
        Node traverse = head;
        while(traverse != null){
            System.out.println(traverse.element);
            traverse = traverse.getNextNode();
        }
    }
    
    
    
    
    
}
