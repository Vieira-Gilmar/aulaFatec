package ilp037.behavioural.interpreter;

public class NumberExpressions {
	private final int number;
	public NumberExpressions(int number) {
		this.number = number;
	}
	public int interpret() {
		return this.number;
	}
	public String toString() {
		return Integer.toString(number);
	}
	
}
