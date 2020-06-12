import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String reply;
		Calculator calculatorOne = new Calculator();
		Scanner scan = new Scanner(System.in, "Cp866");
		
		do {
			System.out.print("Введите первое число: ");
			calculatorOne.setA(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calculatorOne.setMathOperation(scan.next().charAt(0));
			
			System.out.print("Введите второе число: ");
			calculatorOne.setB(scan.nextInt());

			calculatorOne.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]:");
				reply = scan.next();
			} while(!reply.equals("нет") && !reply.equals("да"));
		} while(!reply.equals("нет"));
	}
}