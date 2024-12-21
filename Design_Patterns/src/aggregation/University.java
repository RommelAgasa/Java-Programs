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
public class University {
    
    private String name;
    private Department[] departments;
    
    public University(String name, Department[] departments){
        this.name = name;
        this.departments = departments;
    }
    
    public String getName(){
        return name;
    }
    
    public Department[] getDepartments(){
        return departments;
    }
}
