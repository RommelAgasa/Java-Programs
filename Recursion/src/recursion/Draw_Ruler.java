/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author romme
 */
public class Draw_Ruler {

    public static void main(String[] args) {
        drawRuler(10, 9);
    }
    
    public static void drawOneTick(int lengthTick){
        drawOneTick(lengthTick, -1);
    }
    
    public static void drawOneTick(int lengthTick, int tickLabel){
        for(int i = 0; i < lengthTick; i++)
            System.out.print("_");
        if(tickLabel >= 0) System.out.print(" " + tickLabel); System.out.println();
    }
    
    public static void drawTick(int lengthTick){
        if(lengthTick > 0){
            drawTick(lengthTick - 1);
            drawOneTick(lengthTick);
            drawTick(lengthTick - 1);
        }
    }
    
    public static void drawRuler(int maxLength, int tickLength){
        drawOneTick(tickLength, 0);
        for(int i = 1; i <= maxLength; i++){
            drawTick(maxLength-1);
            drawOneTick(tickLength, i);
        }
    }
}
