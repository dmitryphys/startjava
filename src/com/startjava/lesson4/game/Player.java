package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}