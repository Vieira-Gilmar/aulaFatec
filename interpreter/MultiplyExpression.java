package ilp037.behavioural.interpreter;


	public class MultiplyExpression extends Expression {
		private final Expression leftExpression;
		private final Expression rightExpression;
		
		public MultiplyExpression(Expression le, Expression re) {
			this.leftExpression = le;
			this.rightExpression = re;
			
		}
		
		public int interpret() {
			return this.leftExpression.interpret() 
				    + this.rightExpression.interpret();
		}

		public String toString() {
			return "*";
		}

	}


