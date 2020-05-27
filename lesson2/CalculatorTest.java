import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String reply;
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in, "Cp866");
		
		do {
			System.out.print("Введите первое число: ");
			int number1 = scan.nextInt();

			System.out.print("Введите знак математической операции: ");
			String operation = scan.next();
			
			System.out.print("Введите второе число: ");
			int number2 = scan.nextInt();

			calculatorOne.setA(number1);
			calculatorOne.setMathOperation(operation);
			calculatorOne.setB(number2);
			calculatorOne.getRes();
			do {
				System.out.print("Хотите продолжить? [да/нет]:");
				reply = scan.next();
			} while(!reply.equals("нет") && !reply.equals("да"));
		} while(!reply.equals("нет"));
	}
}