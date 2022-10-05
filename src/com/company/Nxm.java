package com.company;

import java.util.Scanner;

public class Nxm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int stroka = input.nextInt();
        if (stroka < 0) {
            System.out.println("Значение не может быть отрицательным!!!");
            return;
        }
        System.out.print("Введите кол-во солбцов: ");
        int stolbec = input.nextInt();
        if (stolbec < 0) {
            System.out.println("Значение не может быть отрицательным!!!");
            return;
        }
        int[][] array = new int[stroka][stolbec];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] newArray = new int[stolbec][stroka];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
