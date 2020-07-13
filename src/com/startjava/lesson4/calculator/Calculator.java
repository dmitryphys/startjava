package com.startjava.lesson4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private int b;
    private String mathOperation;
    private int res;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }


    public int calculate() {
        switch (mathOperation) {
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
                System.out.println(a + " " + mathOperation + " " + b + " = " + Math.pow(a, b));
                break;
            case "%":
                res = a % b;
                System.out.println(a + " " + mathOperation + " " + b + " = " + res);
        }
        return res;
    }
}
