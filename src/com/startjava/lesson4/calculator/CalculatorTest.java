package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply;
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            String mathEx = scan.nextLine();
            String[] splitMathEx = mathEx.split(" ");
            calculator.setA(Integer.parseInt(splitMathEx[0]));
            calculator.setMathOperation(splitMathEx[1]);
            calculator.setB(Integer.parseInt(splitMathEx[2]));

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить? [да/нет]:");
                reply = scan.nextLine();
            } while (!reply.equals("нет") && !reply.equals("да"));
        } while (!reply.equals("нет"));
    }
}