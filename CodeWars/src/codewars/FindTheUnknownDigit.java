/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.text.ParseException;
import java.util.FormatterClosedException;

/**
 *
 * @author rommel
 */
public class FindTheUnknownDigit {
    
    public static void main(String[] args) {
        
        String expression = "??*??=302?";
        System.out.println(expression + ": ? = "+ solveExpression(expression));
        String expression1 = "123*45?=5?088";
        System.out.println(expression1 + ": ? = "+ solveExpression(expression1));
        String expression2 = "-5?*-1=5?";
        System.out.println(expression2 + ": ? = "+ solveExpression(expression2));
        String expression3 = "19--45=5?";
        System.out.println(expression3 + ": ? = "+ solveExpression(expression3));
        String expression4 = "?*11=??";
        System.out.println(expression4 + ": ? = "+ solveExpression(expression4));
        String expression5 = "?*1=??";
        System.out.println(expression5 + ": ? = "+ solveExpression(expression5));
        String expression6 = "??*?=??";
        System.out.println(expression6 + ": ? = "+ solveExpression(expression6));
        String expression7 = "1+1=?";
        System.out.println(expression7 + ": ? = "+ solveExpression(expression7));   
        
    }
    public static int solveExpression(final String expression){
        
        int missing_digit = -1;
        char[] chnumber = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char soperator = ' ';
        String sfirstNumber = "";
        String ssecondNumber = "";
        String sresult = "";
        boolean bgetSecondNumber = false; 
        boolean bgetResult = false;
        
        // get the firstNumber, operator, and the second number in the expression
        for(int i = 0; i < expression.length(); i++){
            if(operator(expression.charAt(i)) && i != 0 && !bgetSecondNumber){  // operator was read
                bgetSecondNumber = true; // set to true to get the second number after the operator
                soperator = expression.charAt(i);
                continue;
            }
            
            if(expression.charAt(i) == '=') {
                bgetResult = true; // set to true to get the read the result
                continue;
            }
            
            // get the firstNumber from the expression
            if(bgetSecondNumber && !bgetResult){
                ssecondNumber += Character.toString(expression.charAt(i));
            }
            // get the secondNumber from the expression
            else if(!bgetResult){
                sfirstNumber += Character.toString(expression.charAt(i));
            }
            // get the result from the expression
            if(bgetResult){
                sresult += Character.toString(expression.charAt(i));
            }
        }
    
        char[] chfirstNumber = new char[sfirstNumber.length()];
        char[] chsecondNumber = new char[ssecondNumber.length()];
        char[] chresultNumber = new char[sresult.length()];
        
        // Convert String to array
        convertStringToCharArray(chfirstNumber, sfirstNumber);
        convertStringToCharArray(chsecondNumber, ssecondNumber);
        convertStringToCharArray(chresultNumber, sresult);
        
        for(int i = 0; i < chnumber.length; i++){
            
            if(isExist(chfirstNumber, chnumber[i]) ||
               isExist(chsecondNumber, chnumber[i]) || isExist(chresultNumber, chnumber[i]))
                continue;
            
            // Replace the question mark depends to the current index of the chnumber
            // create a temporary array to hold the new character
            char[] chtempFirst = replaceQuestionMark(chfirstNumber, chnumber[i]);
            char[] chtempSecond = replaceQuestionMark(chsecondNumber, chnumber[i]);
            char[] chtempResult = replaceQuestionMark(chresultNumber, chnumber[i]);
            
            String stempFirst = String.valueOf(chtempFirst);
            String stempSecond = String.valueOf(chtempSecond);
            String stempResult = String.valueOf(chtempResult);
            
            
            
            // the numbers are not allowed to be zero
            if((Integer.parseInt(stempFirst) == 0) || (Integer.parseInt(stempSecond) == 0)
                   || (Integer.parseInt(stempResult) == 0) ){
                continue; 
            }
//            System.out.println(stempFirst + " " + stempSecond + " " + stempResult + "= " + resultOfTheExpression(stempFirst, stempSecond, soperator)
//                + " " + (resultOfTheExpression(stempFirst, stempSecond, soperator) == Integer.parseInt(stempResult)));
            
            if(resultOfTheExpression(stempFirst, stempSecond, soperator) == Integer.parseInt(stempResult)){
                return Integer.parseInt(String.valueOf(chnumber[i]));
            }
            
        }
        
        return missing_digit;
    }
    
    
    
    public static boolean operator(char op){
        char[] chroperators = {'+', '-', '*'};
        for(char operator: chroperators){
            if(operator == op) return true;
        }
        return false;
    }
    
     public static void convertStringToCharArray(char[] ch, String n){
        for(int i = 0; i < n.length(); i++){
            ch[i] = n.charAt(i);
        }
    }
    
    public static boolean isExist(char[] ex, char d){
        for(char c: ex){
            if(c == d) return true;
        }
        return false;
    }
    
    
    public static char [] replaceQuestionMark(char[] n, char rep){
        char[] temp = new char[n.length];
        for(int i = 0; i < n.length; i++){
            if(n[i] == '?')
                temp[i] = rep;
            else
               temp[i] = n[i]; 
        }
        return temp;
    }
    
    public static int resultOfTheExpression(String n, String n1, char op){
        int ifirst = Integer.parseInt(n);
        int isecond = Integer.parseInt(n1);
        
        switch(op){
            case '+':
                return (ifirst + isecond); 
            case '-':
                return (ifirst - isecond);
            case '*':
                return (ifirst * isecond);          
        }
        return -1;
    }
    
}
