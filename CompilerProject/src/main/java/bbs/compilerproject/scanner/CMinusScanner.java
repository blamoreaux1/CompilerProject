
package bbs.compilerproject.scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CMinusScanner implements Scanner {
    
    
    private BufferedReader inFile;
    private Token nextToken;
    
    
    public CMinusScanner(String filename){
      
        try {
            inFile = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CMinusScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nextToken = scanToken();
    }
    
    @Override
    public Token getNextToken(){
        Token returnToken = nextToken;
        if(nextToken.getTokenType() != Token.TokenType.EOF_TOKEN){
            nextToken = scanToken();
        }
        return returnToken;
    }
    
    @Override
    public Token viewNextToken(){
        return nextToken;
    }
    
    public Token scanToken(){
        
        String input = "";
        
        try {
            input = inFile.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CMinusScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(input);
       
        Token beans = new Token(Token.TokenType.EOF_TOKEN);
        
        /*
        
        
        
        
        Here is where we will process the input
        
        
        */
        
        return beans;
    }
}
