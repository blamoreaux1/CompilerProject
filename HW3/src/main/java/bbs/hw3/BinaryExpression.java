package bbs.hw3;

public class BinaryExpression extends Expression {
    
    private final Expression var1;
    private final Expression var2;
    private final char operator;
    
    @Override
    long compute(){
        
        if(this.operator == '+'){
            return var1.compute() + var2.compute();
        }
        else{
            return var1.compute() * var2.compute();
        }
    }
    
    public BinaryExpression(Expression e, Expression k, char o){
        this.var1 = e;
        this.var2 = k;
        this.operator = o;
        
    }
}
