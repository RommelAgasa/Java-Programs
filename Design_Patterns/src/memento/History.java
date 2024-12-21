/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author romme
 */
public class History {
    private List<EditorState> states = new ArrayList<>();
    
    public void push(EditorState state){
        states.add(state);
    }
    
    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
    
    
}

