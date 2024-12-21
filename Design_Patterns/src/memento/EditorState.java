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
public class EditorState {
    private final String content;
    
    public EditorState(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }
}
