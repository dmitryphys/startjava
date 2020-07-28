package com.startjava.lesson4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Random random = new Random();
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
        computerNumber = random.nextInt(101);
        setUp();
        do {
            for (int i = 0; i < count; i++) {
                enterNumber(player1);
                checkNumber(player1, i);
                enterNumber(player2);
                checkNumber(player2, i);
            }
            break;
        } while (true);

        writeAboutLimits(player1.getAttempt() + 1, player1.getName(), player1.getNumbers()[player1.getAttempt()]);
        writeAboutLimits(player2.getAttempt() + 1, player2.getName(), player2.getNumbers()[player2.getAttempt()]);

        printNumbers(player1.getAttempt(), player1.getAttempt(), player1.getNumbers());
        printNumbers(player2.getAttempt(), player2.getAttempt(), player2.getNumbers());
    }

    private void enterNumber(Player player) {
        System.out.print("Введите число для игрока " + player.getName() + ": ");
        player.setNumbers(scan.nextInt());
    }


    private void checkNumber(Player player, int attempt) {
        if (player.getNumbers()[attempt] == computerNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + (player.getAttempt() + 1) + " попытки");
        } else if (player.getNumbers()[attempt] < computerNumber) {
            System.out.println("Введенное Вами число " + player.getNumbers()[attempt] + " меньше того, что загадал компьютер");
        } else if (player.getNumbers()[attempt] > computerNumber) {
            System.out.println("Введенное Вами число " + player.getNumbers()[attempt] + " больше того, что загадал компьютер");
        }
    }

    private void writeAboutLimits(int attemptsCount, String playerName, int playerNumber) {
        if (attemptsCount == count && playerNumber != computerNumber) {
            System.out.println("У игрока " + playerName + " закончились попытки!");
        }
    }

    private void printNumbers(int counter, int index, int[] array) {
        for (counter = 0; counter < index; counter++) {
            System.out.print(array[counter] + " ");
        }
        if (index == counter) {
            System.out.println(array[index] + " ");
        }
    }

    private void setUp() {
        player1.fillNumber();
        player2.fillNumber();
        player2.setAttempt(0);
    }
}