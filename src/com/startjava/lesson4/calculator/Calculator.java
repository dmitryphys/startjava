package com.startjava.lesson4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private int b;
    private String mathOperation;
    private int result;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate() {
        switch (mathOperation) {
            case "+":
                return result = a + b;
            case "-":
                return result = a - b;
            case "*":
                return result = a * b;
            case "/":
                return result = a / b;
            case "^":
                return result = (int) Math.pow(a,b);
            case "%":
                return result = a % b;
        }
        return result;
    }
}
