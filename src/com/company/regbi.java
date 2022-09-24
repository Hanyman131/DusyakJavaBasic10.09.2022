package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class regbi {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < 25; i++) {
            team1[i] = (int) (Math.random() * 22 + 18);
            team2[i] = (int) (Math.random() * 22 + 18);
        }
        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));
        {
            double sum1 = 0;
            double sum2 = 0;

            for (int i = 0; i < 25; i++) {
                sum1 += team1[i];
                sum2 += team2[i];
            }
            sum1 /= 25;
            sum2 /= 25;

            System.out.println("Среднее арифметическое первой команды " + sum1);
            System.out.println("Среднее арифметическое второй комады = " + sum2);
        }
    }
}
