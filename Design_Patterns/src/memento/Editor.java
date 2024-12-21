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
public class Editor {
    private String content;
    
    public EditorState createState(){
        return new EditorState(content);
    }
    
    public void restore(EditorState state){
        content = state.getContent();
    }
    
    public String getContent(){
        return this.content;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    
}
