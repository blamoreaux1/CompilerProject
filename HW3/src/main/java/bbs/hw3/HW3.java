/*

Grammar:

Exp -> Factor {op Factor}
op -> +|*
Factor -> NUM | (Exp)

*/
package bbs.hw3;

import java.util.*;


public class HW3 {
    public static int index = 0;
    public static String input;
  

    public static void main(String[] args) {
       
        
        Scanner myObj = new Scanner(System.in);
        input = myObj.nextLine();
        
        
        Expression e = parseExpression();
            
        long output = e.compute();  
    
        System.out.println(output);
        
        
    }
    public static Expression parseExpression () {

        Expression lhs = parseFactor();
        
        if(index >= input.length()){
                return lhs;
            }

        while (input.charAt(index) == '+' || input.charAt(index) == '*') {
            char op = input.charAt(index);
            index++;
            Expression rhs = parseFactor();
             
            lhs = new BinaryExpression(lhs, rhs, op); 
          
            if(index >= input.length()){
                break;
            }
            
        }

        return lhs;
    }
    
    public static Expression parseFactor () {
    switch (input.charAt(index)) {
        case '(':
            index++;
            Expression returnExpr = parseExpression();
            if(index < input.length()){
                if(input.charAt(index) == ')'){
                    index++;
                }
            }
            return returnExpr;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9': 
            return parseNum();
        default:
            System.out.println("something is wrong");
            return null;
        }
    }
    
    public static Expression parseNum(){
        
        Expression e = new NumExpression(Character.getNumericValue(input.charAt(index)));
        index++;
        return e;
        
    }

}





