package com.company;

public class Main {


    public static void main(String[] args) {
        printYearsAndDays(5000000);
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int modDays = days % 365;

        System.out.println(minutes + " min = " + years + " y and " + days + " days");


    }
}