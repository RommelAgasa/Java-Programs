/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercises;

/**
 *
 * @author romme
 */
public class Pair<T, K>{
     T age;
     K name;
     
     T grade;

    public Pair(T age, K name) {
        this.age = age;
        this.name = name;
    }

    public Pair(T age, K name, T grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    

    public T getAge() {
        return age;
    }

    public K getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pair{" + "age=" + age + ", name=" + name + '}';
    }   
    
    
}
