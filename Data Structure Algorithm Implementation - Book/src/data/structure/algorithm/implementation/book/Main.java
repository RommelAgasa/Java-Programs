/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structure.algorithm.implementation.book;

/**
 *
 * @author 
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        
//        SLinkedList list = new SLinkedList();
//        
//        list.addFirst(new Node("Value 1"));
//        list.addFirst(new Node("Value 2"));
//        list.addFirst(new Node("Value 3"));
//        list.addFirst(new Node("Value 4"));
//        list.addLast(new Node("Value 4"));
//        list.addFirst(new Node("Value 1"));
//        list.removeFirst();
//        list.display();      
//    
//        DLinkedList list1 = new DLinkedList();
//        
//        DNode n1 = new DNode("Value 1", null, null);
//        DNode n2 = new DNode("Value 2", null, null);
//        DNode n3 = new DNode("Value 3", null, null);
//        DNode n4 = new DNode("Value 4", null, null);
//        DNode n5 = new DNode("Value 4", null, null);
//        
//        DNode n0 = new DNode("Value 0", null, null);
//        
//        list1.addFirst(n1);
//        list1.addFirst(n2);
//        list1.addFirst(n3);
//        list1.addFirst(n4);
//        list1.addLast(n5);
////        list1.removeFirst();
////        list1.removeLast();
//        //list1.removeLast();
//
//        list1.insertAfter(n2, n0);
//        list1.removeNode(n0);
//        list1.displayFromHead();
//        System.out.println();
//        list1.displayFromTail();
//        System.out.println(list1.getSize());


        DoubleLinkedList list = new DoubleLinkedList();
        DNode n1 = new DNode("Val 1", null, null);
        DNode n2 = new DNode("Val 2", null, null);
        DNode n3 = new DNode("Val 3", null, null);
        DNode n4 = new DNode("Val 4", null, null);
        
        
        list.addFirst(n1);
        System.out.println(list.toString());
    }
    
}
