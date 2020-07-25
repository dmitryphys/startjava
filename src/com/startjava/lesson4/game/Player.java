package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] number = new int[10];
    private int index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumber() {
        return number;
    }

    public int getIndex() {
        return index;
    }

    public void setNumber(int index, int number) {
        this.index = index;
        this.number[index] = number;
    }

    public void fillNumber(int index) {
        Arrays.fill(number, 0, index, 0);
    }
}