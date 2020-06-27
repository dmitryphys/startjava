package com.startjava.lesson2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String reply;
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in, "Cp866");
		
		do {
			System.out.print("Введите первое число: ");
			calculator.setA(scan.nextInt());

			System.out.print("Введите знак математической операции: ");
			calculator.setMathOperation(scan.next().charAt(0));
			
			System.out.print("Введите второе число: ");
			calculator.setB(scan.nextInt());

			calculator.calculate();
			do {
				System.out.print("Хотите продолжить? [да/нет]:");
				reply = scan.next();
			} while(!reply.equals("нет") && !reply.equals("да"));
		} while(!reply.equals("нет"));
	}
}