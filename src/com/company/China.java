package com.company;

public class China {
    public static void main(String[] args) {
        String name = "Li";
        int a = 13;
        int b = 24;
        int c = 46;
        int summ_li = 860*(a+b+c);
        String name1 = "Min";
        int d = 9;
        int e = 35;
        int f = 12;
       double summ_min = 860*(d+e+f)*1.5;

        double summ_li_min = summ_li + summ_min;
        System.out.println("Общий урон династии " + (name) + " = " + (summ_li));
        System.out.println("Общий урон династии " + (name1) + " = " + (summ_min));
        System.out.println("Общий урон двух династий" + " = " + (summ_li_min));
    }
}
