public class Calculator {
	private int a;
	private int b;
	char mathOperation; // выберите математическую операцию

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	private int res;

	public void setB(int b) {
		this.b = b;
	}

	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}

	public int calculate() {
		switch(mathOperation) {
			case '+':
				res = a + b;
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case '-':
				res = a - b;
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case '*':
				res = a * b;
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case '/':
				res = a / b;
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case '^':
				res = 1;
				for(int i = 1; i <= b; i++) {
						res *= a;
					}
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case '%':
				res = a % b;
				System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			// default:
			// break;
		}
	return res;
	}
}
	