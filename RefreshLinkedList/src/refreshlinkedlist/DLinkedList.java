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
public class DLinkedList {
    
    private DNode header, trailer;
    private DNode next, prev;
    private int size;

    public DLinkedList(){
        this.header = new DNode("head", null, null);
        this.trailer = new DNode("trail", null, header);
        this.header.setNext(trailer);
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public DNode getFirst(){
        return header.getNext();
    }
    
    public DNode getLast(){
        return trailer.getPrev();
    }
    
    public DNode getPrev(DNode node){
        return node.getPrev();
    }
    
    public DNode getNext(DNode node){
        return node.getNext();
    }

    public void addFirst(DNode newNode){
        DNode temp = header.getNext();
        temp.setPrev(newNode);
        header.setNext(newNode);
        newNode.setNext(temp);
        newNode.setPrev(header);
        size++;
    }
    
    public void addLast(DNode newNode){
        DNode temp = trailer.getPrev();
        temp.setNext(newNode);
        newNode.setPrev(temp);
        newNode.setNext(trailer);
        trailer.setPrev(newNode);
        size++;
    }
    
    public void addBefore(DNode z, DNode w){
        DNode u = z.getNext();
        z.setNext(w);
        w.setPrev(z);
        w.setNext(u);
        u.setPrev(w);
        size++;
    }
    
    public void addAfter(DNode z, DNode w){
        DNode u = z.getPrev();
        w.setNext(z);
        w.setPrev(u);
        z.setPrev(w);
        u.setNext(w);
        size++;
    }
    
    public void remove(DNode w){
        DNode z = w.getPrev();
        DNode u = w.getNext();
        z.setNext(u);
        u.setPrev(z);
        w.setNext(null);
        w.setPrev(null);
    }
    
    public boolean hasPrev(DNode node){
        return node != trailer;
    }
    
    public boolean hasNext(DNode node){
        return node != header;
    }

    
    @Override
    public String toString(){
        String s = "";
        DNode temp = header.getNext();
        while(temp.getValue() != trailer.getValue() ){
            s += temp.getValue() + " ";
            temp = temp.getNext();
        }
        
        return s;
    }
    
    
}
