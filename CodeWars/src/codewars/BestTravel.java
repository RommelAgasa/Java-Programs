package codewars;


import java.util.*;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rommel
 */
public class BestTravel {
    
    public static void main(String[] args) {
        
        List<Integer> ls = new ArrayList<>();
        ls.add(50);
        ls.add(74);
        ls.add(73);
        ls.add(81);
        ls.add(87);
        chooseBestSum(230, 3, ls);
        System.out.println(chooseBestSum(230, 3, ls));
        
    }
    
    public static Integer chooseBestSum(int t, int k, List<Integer> ls){
        
        int bestMiles = 0;
        int biggestSum = 0;
        int temp = 0;
        int[] mil = convertToArray(ls);
        int row = numberOfCombination(ls.size(), k);
        int[][] combiDistance = new int[row][k];
        combination(mil, 0, combiDistance, k, 0, row, k-1); // get the combination of distance
        
         //Display the result in combination (for checking purpose)
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < k; j++)
//                System.out.print(combiDistance[i][j] + " ");
//            System.out.println("");
//        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < k; j++)
                temp += combiDistance[i][j]; // add all in the row
            
            if(temp > biggestSum && temp < t)
                biggestSum = temp;
            if(biggestSum < t)
                bestMiles = biggestSum;
            
            temp = 0;
        }

        return bestMiles == 0? -1 : bestMiles;
    }
    
    public static void combination(int[] distance, int currentFirst,
            int[][] combiResult, int k, int currentRow, int row, int pivot){
        
        if(currentFirst == (distance.length-2))
            return ;
        
        if(distance.length <= 1)
            return;

        int curSec = currentFirst+1;
        int pivotOrigPlace = pivot;
        while(curSec < distance.length-1){
            for(int j = pivotOrigPlace; j < distance.length; j++){
                
                int i = 1;
                int shift = curSec;
                combiResult[currentRow][0] = distance[currentFirst]; // get the first element in the row
                for(; i < k-1; i++){
                    combiResult[currentRow][i] = distance[shift];  // succeding element
                    shift++;
                }
                combiResult[currentRow][i] = distance[j]; // last element
                currentRow++;
            }
            pivotOrigPlace++;
            curSec++;
        }

        combination(distance, currentFirst+=1,
            combiResult, k, currentRow, row, pivot+1);
    }
    
    static int numberOfCombination(int numOfItem, int k){    
        return factorial(numOfItem)/(factorial((numOfItem-k)) * factorial(k));
    }
    
    static int factorial(int f){ 
        int product = 1;
        for(int i = 1; i <= f; i++){
            product *= i;
        }
        return product;
    }

    static int[] convertToArray(List<Integer> distance){
        int[] temp = new int[distance.size()];
        int i = 0;
        for (Integer integer : distance) {
            temp[i] = integer;
            i++;
        }
        return temp;
     }
    
}
