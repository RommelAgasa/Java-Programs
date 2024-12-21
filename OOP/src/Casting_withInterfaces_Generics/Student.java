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
public class Student implements Person {
    
    String id;
    String name;
    int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }
    
    protected int studyHours(){
        return age/2;   // just a guess
    }

    @Override
    public boolean equalTo(Person other) {
        Student otherStudent = (Student)other;      // cast Person to Student
        return (this.id.equals(otherStudent.getId()));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "ID = " + id + ", Name = " + name + ", Age = " + age + '}';
    }
    
    
    
}
