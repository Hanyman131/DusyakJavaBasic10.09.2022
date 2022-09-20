package com.company;

import java.util.Scanner;

public class gamecreation {
    public static void main(String[] args) {
        int randomDigit = (int) (Math.random() * 10);
        System.out.println(randomDigit);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            if (scanner.hasNextInt()) {
                int inputDigit = scanner.nextInt();
                if (randomDigit == inputDigit) {
                    System.out.println("Поздравляю, вы выиграли!!!");
                    return;
                } else if (i != 2)
                    System.out.println("Вы не угадали");
            } else if (i != 2) {
                System.out.println("Введите число от 0 до 10");
                scanner.next();
            }
        }
        System.out.println("Вы проиграли");
    }
}
