
package bbs.compilerproject.scanner;

public class Token {
    
    public enum TokenType{
        EOF_TOKEN,
        IDENT_TOKEN,
        IF_TOKEN,
        THEN_TOKEN,
        ELSE_TOKEN,
        END_TOKEN,
        REPEAT_TOKEN,
        UNTIL_TOKEN,
        READ_TOKEN,
        WRITE_TOKEN,
        CLASS_TOKEN,
        EQ_TOKEN,
        LT_TOKEN,
        GT_TOKEN,
        PLUS_TOKEN,
        MINUS_TOKEN,
        TIMES_TOKEN,
        SLASH_TOKEN,
        LPAREN_TOKEN,
        RPAREN_TOKEN,
        SEMI_TOKEN,
        LBRACKET_TOKEN,
        RBRACKET_TOKEN,
        NUMBER_TOKEN 
    }
   
    public Token(TokenType type){
        this(type, null);
    }
    
    public Token(TokenType type, Object data){
        tokenType = type;
        tokenData = data;
    }
    
    public TokenType getTokenType(){
        return this.tokenType;
    }
    
    public Object getTokenData(){
        return this.tokenData;
    }
    private TokenType tokenType;
    private Object tokenData;
}
