package ilp037.behavioural.interpreter;

public class PlusExpression extends Expression {
	private final Expression leftExpression;
	private final Expression rightExpression;
	
	public PlusExpression(Expression le, Expression re) {
		this.leftExpression = le;
		this.rightExpression = re;
		
	}
	
	public int interpret() {
		return this.leftExpression.interpret() 
			    + this.rightExpression.interpret();
	}

	public String toString() {
		return "+";
	}

}
