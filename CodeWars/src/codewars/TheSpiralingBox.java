/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author rommel
 */
public class TheSpiralingBox {
    
    public static void main(String[] args) {

        int height = 10;
        int width = 10;
        int[][] res = box(width, height);
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
    
    static int [][] box(int width, int height){
        
        /*
        1. All the elements in the first and last row and column are 1
        2. All the elements in the second and second-last 
            row and column are 2 excluding the elements from step 1
        3. All the elements in the third and third-last row
            and column are 3 excluding the elements from the prevoius
            steps.
        4. And so on..
        */
        
        int[][] res = new int[height][width];
        int startRow = 0;
        int startCol = 0;
        int endRow = height;
        int endCol = width;
        int fill = 1;
        
        return helper(res, startRow, startCol, endCol, endRow, fill, width);
    }
    
    static int [][] helper(int[][] res, int startRow, int startCol, int endCol,
            int endRow, int fill, int width){
        
        int mid = width % 2 != 0? (width/2+1): (width/2) ;
        if(mid < fill){
            return res;
        }
        
         for(int i = startRow; i < endRow; i++){
            if(startRow == i || i == endRow-1)
                fillHorizontal(res, startCol, endCol, i, fill);
            res[i][startCol] = fill;
            res[i][endCol-1] = fill;
        }
         return helper(res, startRow += 1, startCol += 1, endCol -= 1,
            endRow -= 1, fill += 1, width);
    }
    
    static void fillHorizontal(int[][] res, int startCol, int endCol, int indexRow, int fill){
        int i = startCol;
        for(; i < endCol; i++)
            res[indexRow][i] = fill;  
    }
}
