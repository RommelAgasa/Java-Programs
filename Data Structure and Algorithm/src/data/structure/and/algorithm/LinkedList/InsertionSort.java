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
public class InsertionSort {
    
    public static void insertionSort(DoublyLinkedList list){
        if(list.getSize() <= 0) return;
        DNode pivot;
        DNode ins;
        DNode end = list.getFirst();
        while(end != list.getLast()){
            pivot = end.getNext();
            list.remove(pivot);
            ins = end;
            while(list.hasPrev(ins) &&
                    ins.getElement().compareTo(pivot.getElement()) > 0)
                ins = ins.getPrev();
            list.addAfter(ins, pivot);
            if(ins == end)
                end = end.getNext();
        }
        
        
    }
}
