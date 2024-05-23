package ilp037.behavioural.interpreter;

public class MinusExpression {


		private final Expression leftExpression;
		private final Expression rightExpression;
		
		public MinusExpression(Expression le, Expression re) {
			this.leftExpression = le;
			this.rightExpression = re;
			
		}
		
		public int interpret() {
			return this.leftExpression.interpret() 
				    + this.rightExpression.interpret();
		}

		public String toString() {
			return "-";
		}

	}


