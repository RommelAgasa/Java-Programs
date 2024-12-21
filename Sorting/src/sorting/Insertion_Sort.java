/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author romme
 */
public class Insertion_Sort {
    
    private int DEFAULTSIZE = 10;
    private int[] array;
    private int currentIndex = 0;

    public Insertion_Sort() {
        array = new int[DEFAULTSIZE];
    }
    
    public Insertion_Sort(int size) {
        array = new int[size];
    }

    public int getSize() {
        return DEFAULTSIZE;
    }
    
    public void add(int newElement){
        array[currentIndex++] = newElement;
    }

    public void sort(){
        for(int i = 1; i < currentIndex; i++){
            int current = array[i];
            int j = i-1;
            while((j>=0) && current < array[j])
                array[j+1] = array[j--];
            array[j+1] = current;
        }
    }
    
    
    @Override
    public String toString() {
        String s = "[";
        for(int i = 0; i < currentIndex; i++){
            s += array[i] + " ";
        }
        return s + "]";
    } 
}
