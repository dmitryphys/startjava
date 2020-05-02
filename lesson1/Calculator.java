public class Calculator {
	public static void main(String[] args) {
		int a = 6; // задайте значение для переменной 'a'
		int b = 3; // задайте значение для переменной 'b'
		int res = a;
		char plus = '+';
		char minus = '-';
		char proizv = '*';
		char del = '/';
		char step = '^';
		char ost = '%';
		char choise = '^'; // выберите математическую операцию
		if(choise == plus) {
			res = a + b;
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
		if(choise == minus) {
			res = a - b;
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
		if(choise == proizv) {
			res = a * b;
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
		if(choise == del) {
			res = a / b;
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
		if(choise == step) {
			for(int i = 2; i <= b; i++) {
				res = res * a;
			}
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
		if(choise == ost) {
			res = a % b;
			System.out.println(a + " " + choise + " " + b + " = " + res);
		}
	}
}