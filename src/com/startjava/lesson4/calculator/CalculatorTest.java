package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String reply;
        com.startjava.lesson4.calculator.Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            String mathEx = scan.nextLine();
            String[] arrMathEx = mathEx.split(" ");
            calculator.setA(Integer.parseInt(arrMathEx[0]));
            calculator.setMathOperation(arrMathEx[1]);
            calculator.setB(Integer.parseInt(arrMathEx[2]));

            calculator.calculate();
            do {
                System.out.print("Хотите продолжить? [да/нет]:");
                reply = scan.next();
            } while (!reply.equals("нет") && !reply.equals("да"));
        } while (!reply.equals("нет"));
    }
}