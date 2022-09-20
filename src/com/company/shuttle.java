package com.company;

public class shuttle {
    public static void main(String[] args) {

        int counter = 0;
        int test = 101;
        for (int i = 1; i < test; i++) {
            String str = Integer.toString(i);
            if (str.contains("4") || str.contains("9")) {
                test = test + 1;
                continue;
            }

            System.out.println("shuttle number:" + i);
            counter++;

        }
        System.out.println("count =" + counter);

    }
}