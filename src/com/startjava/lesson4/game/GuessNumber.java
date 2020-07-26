package com.startjava.lesson4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random compNumb = new Random();
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int computerNumber;
    private int count = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        computerNumber = compNumb.nextInt(101);
        changeNumber();
        player2.setIndex(0);
        do {
            for (int i = 0; i < count; i++) {
                enterNumber1(i);
                if (player1.getNumber()[i] == computerNumber) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + computerNumber + " с " + (player1.getIndex() + 1) + " попытки");
                    break;
                } else checkNumber(player1.getNumber()[i], player1.getName(), player1.getIndex() + 1);
                enterNumber2(i);
                if (player2.getNumber()[i] == computerNumber) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + computerNumber + " с " + (player2.getIndex() + 1) + " попытки");
                    break;
                } else checkNumber(player2.getNumber()[i], player2.getName(), player2.getIndex() + 1);
            }
            break;
        } while (true);

        writeAboutLimits(player1.getIndex() + 1, player1.getName(), player1.getNumber()[player1.getIndex()]);
        writeAboutLimits(player2.getIndex() + 1, player2.getName(), player2.getNumber()[player2.getIndex()]);

        printArray(player1.getIndex(), player1.getIndex(), player1.getNumber());
        printArray(player2.getIndex(), player2.getIndex(), player2.getNumber());
    }

    public void enterNumber1(int arrElement) {
        System.out.print("Введите число для игрока " + player1.getName() + ": ");
        player1.setNumber(arrElement, scan.nextInt());
    }

    public void enterNumber2(int arrElement) {
        System.out.print("Введите число для игрока " + player2.getName() + ": ");
        player2.setNumber(arrElement, scan.nextInt());
    }

    public void checkNumber(int playerNumber, String playerName, int attempt) {
        if (playerNumber < computerNumber) {
            System.out.println("Введенное Вами число " + playerNumber + " меньше того, что загадал компьютер");
        } else if (playerNumber > computerNumber) {
            System.out.println("Введенное Вами число " + playerNumber + " больше того, что загадал компьютер");
        }
    }

    public void writeAboutLimits(int attemptsCount, String playerName, int playerNumber) {
        if (attemptsCount == count && playerNumber != computerNumber) {
            System.out.println("У игрока " + playerName + " закончились попытки!");
        }
    }

    public void printArray(int counter, int index, int[] array) {
        for (counter = 0; counter < index; counter++) {
            System.out.print(array[counter] + " ");
        }
        if (index == counter) {
            System.out.println(array[index] + " ");
        }
    }

    public void changeNumber() {
        player1.fillNumber(player1.getIndex() + 1);
        player2.fillNumber(player2.getIndex() + 1);
    }
}