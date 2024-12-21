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
public class StringExcercise {
    
    public static void main(String[] args) {
        
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("the_stealth_warrior"));
        System.out.println(toCamelCase("the_stealth-warrior"));
        
        System.out.println("----------------------------------");
        System.out.println(camelCase("hello case"));
        System.out.println(camelCase("camel case word"));
        
        System.out.println("----------------------------------");
        System.out.println(removeSpace("hello case"));
        System.out.println(removeSpace("camel case word"));
        
        System.out.println("----------------------------------");
        System.out.println(repeatString(4, "I"));
        System.out.println(repeatString(5, "hello"));
        
    }
    
    public static String toCamelCase(String str){
        String camelCaseString = "";
        
        for(int i = 0; i < str.length(); i++){
            if(i==0){
                camelCaseString += Character.toUpperCase(str.charAt(i));
            }
            else if((str.charAt(i) == '-') || (str.charAt(i) == '_')){
                i++;
                camelCaseString += Character.toUpperCase(str.charAt(i));
            }
            else{
                camelCaseString += str.charAt(i);
            }
        }

        return camelCaseString;
    }
    
    public static String camelCase(String str){
        String camelCaseString = "";
        
        for(int i = 0; i < str.length(); i++){
            if(i==0){
                camelCaseString += Character.toUpperCase(str.charAt(i));
            }
            else if((str.charAt(i) == ' ')){
                i++;
                camelCaseString += Character.toUpperCase(str.charAt(i));
            }
            else{
                camelCaseString += str.charAt(i);
            }
        }
        return camelCaseString;
    }
    
    public static String removeSpace(String str){
        String noSpace = "";    
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ') i++;
            noSpace += str.charAt(i);
        }
        
        return noSpace;
    }
    
    
    public static String repeatString(final int repeat, final String string){
        String repeatedString = "";
        
        for(int i = 0; i < repeat; i++){
            repeatedString += string;
        }
        return repeatedString;
    }

}
