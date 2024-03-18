package bbs.hw3;

public class NumExpression extends Expression{
    
    private long num;
    
    @Override
    long compute(){
        
        return this.num;
    }
    
    public NumExpression(int i){
        num = i;
    }
}
