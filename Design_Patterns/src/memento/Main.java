/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author romme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        var editor = new Editor();
        var history = new History();
        
        editor.setContent("a");
        history.push(editor.createState());
        
        editor.setContent("b");
        history.push(editor.createState());
        
        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());
        
        System.out.println(editor.getContent());
    }
    
}
