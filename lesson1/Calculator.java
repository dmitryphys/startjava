public class Calculator {
	public static void main(String[] args) {
		int a = 6; // задайте значение для переменной 'a'
		int b = 3; // задайте значение для переменной 'b'
		int res = a;
		char mathOperation = '*'; // выберите математическую операцию

		if(mathOperation == '+') {
			res = a + b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		} else if(mathOperation == '-') {
			res = a - b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		} else if(mathOperation == '*') {
			res = a * b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		} else if(mathOperation == '/') {
			res = a / b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		} else if(mathOperation == '^') {
			for(int i = 2; i <= b; i++) {
				res *= a;
			}
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		} else if(mathOperation == '%') {
			res = a % b;
			System.out.println(a + " " + mathOperation + " " + b + " = " + res);
		}
	}
}