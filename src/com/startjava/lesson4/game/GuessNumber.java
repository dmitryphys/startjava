package com.startjava.lesson4.game;

import java.util.Arrays;
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
        int i = 0;
        setup();
        do {
            enterNumber(player1);
            if (checkNumber(player1, i)) {
                break;
            }
            enterNumber(player2);
            if (checkNumber(player2, i)) {
                break;
            }
            i++;
        } while (i < count);

        writeAboutLimits(player1);
        writeAboutLimits(player2);

        printNumbers(player1);
        printNumbers(player2);
    }

    private void setup() {
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
        boolean checkResult = number == computerNumber;
        if (checkResult) {
            System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + (player.getAttempt()) + " попытки");
        } else if (number < computerNumber) {
            System.out.println("Введенное Вами число " + number + " меньше того, что загадал компьютер");
        } else if (number > computerNumber) {
            System.out.println("Введенное Вами число " + number + " больше того, что загадал компьютер");
        }
        return checkResult;
    }

    private void writeAboutLimits(Player player) {
        if (player.getAttempt() == count && player.getNumbers()[player.getAttempt() - 1] != computerNumber) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void printNumbers(Player player) {
        int[] arrCopy = Arrays.copyOf(player.getNumbers(), player.getNumbers().length);
        if (arrCopy.length > 0) {
            for  (int number : Arrays.copyOf(arrCopy, arrCopy.length - 1)) {
                System.out.print(number + " ");
            }
        }
        player.getLastNumber();
    }
}