/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casting_withInterfaces_Generics;

/**
 *
 * @author romme
 */
public class Pair<K, V> {
    K key;
    V value;
    
    public void set(K k, V v){
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[" + "key = " + getKey() + ", value = " + getValue() + ']';
    }
    
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<String, Integer>();
        pair1.set("age", new Integer(2));
        System.out.println(pair1.toString());
        Pair<Student, Double> pair2 = new Pair<Student, Double>();
        pair2.set(new Student("Q2423", "Sue", 19), new Double(9192.22));
        System.out.println(pair2.toString());
        
    }
}
