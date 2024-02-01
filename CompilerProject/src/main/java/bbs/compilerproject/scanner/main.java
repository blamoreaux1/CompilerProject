
package bbs.compilerproject.scanner;

import java.io.InputStream;


public class main {
  
     public static void main(String[] args) {
       
         CMinusScanner scan = new CMinusScanner("/Users/bennyballin/NetBeansProjects/CompilerProject/src/main/java/bbs/compilerproject/scanner/testInput.txt");
         Token output;
         
         output = scan.getNextToken();
         
         
    }

}
