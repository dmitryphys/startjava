package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random compNumb = new Random();
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int computerNumber = compNumb.nextInt(101);
    private int count = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        do {
            for (int i = 0; i < count; i++) {
                System.out.print("Введите число для игрока " + player1.getName() + ": ");
                player1.setNumber(i, scan.nextInt());
                if (player1.getNumber()[i] == computerNumber) {
                    System.out.println("Игрок " + player1.getName() + " угадал число " + computerNumber + " с " + (player1.getIndex() + 1) + " попытки");
                    break;
                } else if (player1.getNumber()[i] < computerNumber) {
                    System.out.println("Введенное Вами число " + player1.getNumber()[i] + " меньше того, что загадал компьютер");
                } else if (player1.getNumber()[i] > computerNumber) {
                    System.out.println("Введенное Вами число " + player1.getNumber()[i] + " больше того, что загадал компьютер");
                }
                System.out.print("Введите число для игрока " + player2.getName() + ": ");
                player2.setNumber(i, scan.nextInt());
                if (player2.getNumber()[i] == computerNumber) {
                    System.out.println("Игрок " + player2.getName() + " угадал число " + computerNumber + " с " + (player2.getIndex() + 1) + " попытки");
                    break;
                } else if (player2.getNumber()[i] < computerNumber) {
                    System.out.println("Введенное Вами число " + player2.getNumber()[i] + " меньше того, что загадал компьютер");
                } else if (player2.getNumber()[i] > computerNumber) {
                    System.out.println("Введенное Вами число " + player2.getNumber()[i] + " больше того, что загадал компьютер");
                }
            }
            break;
        } while (true);

        writeFinishedAttempts(player1.getIndex() + 1, player1.getName(), player1.getNumber()[player1.getIndex()]);
        writeFinishedAttempts(player2.getIndex() + 1, player2.getName(), player2.getNumber()[player2.getIndex()]);

        System.out.print(Arrays.toString(Arrays.copyOf(player1.getNumber(), player1.getIndex() + 1)) + " ");
        System.out.println(Arrays.toString(Arrays.copyOf(player2.getNumber(), player2.getIndex() + 1)) + " ");
    }

    public void writeFinishedAttempts(int attemptsCount, String playerName, int playerNumber) {
        if (attemptsCount == count && playerNumber != computerNumber) {
            System.out.println("У игрока " + playerName + " закончились попытки!");
        }
    }

    public void changeNumber() {
        player1.fillNumber(player1.getIndex() + 1);
        player2.fillNumber(player2.getIndex() + 1);
    }
}