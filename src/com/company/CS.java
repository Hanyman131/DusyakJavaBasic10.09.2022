package com.company;

public class CS {
    public static void main(String[] args) {
        String name = "JavaNoobs";
        int a = 11;
        int b = 31;
        int c = 12;
        int e = 9;
        int d = 27;
        int midkills = (a + b + c + e + d) / 5;
        String name1 = "JavaDMG";
        int a1 = 13;
        int b1 = 17;
        int c1 = 0;
        int e1 = 33;
        int d1 = 25;
        int midkills1 = (a1 + b1 + c1 + e1 + d1) / 5;
        int whotop = midkills - midkills1;
        System.out.println(midkills);
        System.out.println(midkills1);
        System.out.println(whotop);
        System.out.println("Перемогла команда " + name + " яка набрала " + midkills + " очків");

    }


}
