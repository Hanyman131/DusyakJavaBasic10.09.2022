package com.company;

import java.util.Arrays;

public class lot {
    public static void main(String[] args) {
        int[] arrayLottery = new int[7];
        for (int i = 0; i < arrayLottery.length; i++) {
            arrayLottery[i] = (int) (Math.random() * 9);
        }
        Arrays.sort(arrayLottery, 0, 7);
        System.out.print(Arrays.toString(arrayLottery) + "\t\n");
        int[] arrayPlayer = new int[7];
        for (int i = 0; i < arrayPlayer.length; i++) {
            arrayPlayer[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arrayPlayer, 0, 7);
        System.out.print(Arrays.toString(arrayPlayer) + "\t\n");
        int count = 0;
        for (int i = 0; i < arrayLottery.length; i++) {
            if (arrayLottery[i] == arrayPlayer[i]) {
                count++;
            }
        }
        System.out.println("Кількість збігів: " + count);
    }
}
