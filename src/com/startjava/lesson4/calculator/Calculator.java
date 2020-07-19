package com.startjava.lesson4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private int b;
    private String mathOperation;
    private int result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        switch (mathOperation) {
            case "+":
                result = a + b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            case "*":
                result = a * b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            case "/":
                result = a / b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            case "^":
                result = (int) Math.pow(a, b);
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            case "%":
                result = a % b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + result);
                break;
            default:
                System.out.println("Данная математическая операция калькулятором не обрабатывается");
                break;
        }
    }
}
