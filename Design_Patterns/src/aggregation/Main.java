/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregation;

/**
 *
 * @author romme
 */
public class Main {

    /**
     * Aggregation represents a "has-a" relationship, 
     * where one class contains objects of another class, 
     * but the contained objects can exist independently of the container. 
     */
    
    public static void main(String[] args) {
        
        // create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");
        
        // create university with departments
        University university = new University("XYZ", new Department[]{department1, department2});
        
        // access university's departments
        Department[] departments = university.getDepartments();
        for(Department department: departments){
            System.out.println(department.getName());
        }
    }
    
}
