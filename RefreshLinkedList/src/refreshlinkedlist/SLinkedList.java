/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refreshlinkedlist;

/**
 *
 * @author romme
 */
public class SLinkedList {
    
    private SNode head;
    private SNode tail;
    private int size;
    
    public SLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public void addFirst(SNode node){
        if(head == null){
            this.head = node;
            head.setNext(null);
            tail = head;
            size += 1;
            return;
        }
        
        node.setNext(head);
        head = node;
        size += 1;
    }
    
    public void addLast(SNode node){
        node.setNext(null);
        tail.setNext(node);
        tail = node;
        size += 1;
    }
    
    public void removeFirst(){
        
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
            
        SNode temp = head;
        head = head.getNext();
        size -= 1;
        temp.setNext(null);

    }
    
    public int getSize(){ return size; }
    
    @Override
    public String toString(){
        SNode temp = head;
        String s = "[ ";
        while(temp != null){
            s += temp.getValue().toString() + " ";
            temp = temp.getNext();
        }
        
        return s + " ]";
    }
    
}
