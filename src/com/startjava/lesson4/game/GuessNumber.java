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
        int i = 0;
        setup();
        do {
            if (makeMove(player1, i)) {
                break;
            }
            if (makeMove(player2, i)) {
                break;
            }
            i++;
        } while (i < count);

        printNumbers(player1);
        printNumbers(player2);
    }

    private void setup() {
        player1.fillNumbers();
        player2.fillNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private boolean makeMove(Player player, int attempt) {
        boolean isBreak = false;
        enterNumber(player);
        if (player.getAttempt() == count && !checkNumber(player, attempt)) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        } else {
            isBreak = checkNumber(player, attempt);
        }
        return isBreak;
    }

    private void enterNumber(Player player) {
        System.out.print("Игрок, " + player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean checkNumber(Player player, int attempt) {
        int number = player.getLastNumber();
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

    private void printNumbers(Player player) {
        int[] numbers = player.getNumbers();
        int i = -1;
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}