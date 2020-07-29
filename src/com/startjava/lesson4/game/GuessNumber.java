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
                if (checkNumber(player1, i) == true) {
                    break;
                }
                enterNumber(player2);
                if (checkNumber(player2, i) == true) {
                    break;
                }
            }
            break;
        } while (true);

        writeAboutLimits(player1);
        writeAboutLimits(player2);

        printNumbers(player1);
        printNumbers(player2);
    }

    private void setUp() {
        player1.fillNumbers();
        player2.fillNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private void enterNumber(Player player) {
        System.out.print("Введите число для игрока " + player.getName() + ": ");
        player.setNumber(scan.nextInt());
    }

    private boolean checkNumber(Player player, int attempt) {
        int number = player.getNumbers()[attempt];
        boolean isCompNumber = number == computerNumber;
        if (isCompNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + (player.getAttempt()) + " попытки");
        } else
            if (number < computerNumber) {
            System.out.println("Введенное Вами число " + number + " меньше того, что загадал компьютер");
        } else if (number > computerNumber) {
            System.out.println("Введенное Вами число " + number + " больше того, что загадал компьютер");
        }
        return isCompNumber;
    }

    private void writeAboutLimits(Player player) {
        if (player.getAttempt() == count && player.getNumbers()[player.getAttempt() - 1] != computerNumber) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void printNumbers(Player player) {
        int counter = 0;
        for (counter = 0; counter < player.getAttempt() - 1; counter++) {
            System.out.print(player.getNumbers()[counter] + " ");
        }
        boolean isLastElement = counter == player.getAttempt() - 1;
        if (isLastElement) {
            System.out.println(player.getNumbers()[counter] + " ");
        }
    }
}