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
public class RefreshLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        
//        SLinkedList listAge = new SLinkedList();
//        listAge.addFirst(new SNode(20));
//        listAge.addFirst(new SNode(22));
//        listAge.addLast(new SNode(11));
//        listAge.removeFirst();
//        System.out.println(listAge.toString());
          

        DLinkedList listNo = new DLinkedList();
        
        DNode n1 = new DNode(1, null, null);
        DNode n2 = new DNode(2, null, null);
        DNode n3 = new DNode(3, null, null);
        DNode n4 = new DNode(4, null, null);
        listNo.addFirst(n1);
        listNo.addLast(n2);
        listNo.addBefore(n2, n3);
        listNo.addAfter(n2, n4);
        listNo.remove(n4);
        System.out.println(listNo.toString());
    }
    
}
