package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public
class
Test {

    public static void main(String[] args) {


        System.out.println("Введите");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
