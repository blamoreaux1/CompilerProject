
package bbs.compilerproject.scanner;
import java.io.BufferedReader;

public interface Scanner {

    public Token getNextToken();
    public Token viewNextToken();
   
}
