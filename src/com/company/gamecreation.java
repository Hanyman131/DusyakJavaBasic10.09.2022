package com.company;

import java.util.Scanner;

public class gamecreation {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        int b = 0;
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (a == b) {
                    System.out.println("Поздравляю, вы выиграли!!!");
                    return;
                } else {
                    if (i != 2)
                    System.out.println("Вы не угадали");
                }
            } else {
                if (i != 2)
                System.out.println("Введите число от 0 до 10");
                scanner.next();
            }
        }
        System.out.println("Вы проиграли");
    }
}
