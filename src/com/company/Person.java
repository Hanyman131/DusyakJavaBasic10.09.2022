package com.company;

public class Person {
    public static void main(String[] args) {
        personInfo("Will", "Smith", "New York", "2936729462846");
        personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock", "Holmes", "London", "37742123513");

    }

    public static String personInfo(String name, String surname, String city, String phone) {
        String test = "Зателефонувати громадянину " + name + " " + surname + " із міста " + city + " можна за номером " + phone + ".";
        System.out.println(test);
        return test;
    }
}
