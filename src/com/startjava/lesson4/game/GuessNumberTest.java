package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String reply;
        Scanner scan = new Scanner(System.in);

        System.out.println("У вас 10 попыток");
        System.out.print("Введите имя 1-го игрока: ");
        Player player1 = new Player(scan.next());

        System.out.print("Введите имя 2-го игрока: ");
        Player player2 = new Player(scan.next());

        GuessNumber game = new GuessNumber(player1, player2);

        do {
            game.play();
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                reply = scan.next();
            } while (!reply.equals("да") && !reply.equals("нет"));
        } while (reply.equals("да"));
    }
}