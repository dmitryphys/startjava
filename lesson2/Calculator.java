public class Calculator {
	private int a;
	private int b;
	private String mathOperation; // выберите математическую операцию

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

	public void setMathOperation(String mathOperation) {
		this.mathOperation = mathOperation;
	}

	public int getRes() {
		switch(mathOperation) {
			case "+":
			res = a + b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case "-":
			res = a - b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case "*":
			res = a * b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case "/":
			res = a / b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case "^":
			if(b == 0) {
				res = 1;
			} else {
				res = a;
				for(int i = 2; i <= b; i++) {
					res *= a;
				}
			}
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			case "%":
			res = a % b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
				break;
			// default:
			// break;
		}
	return res;}
}
