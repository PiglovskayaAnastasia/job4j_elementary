package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        amount = amount + (amount * percent / 100);
        while (salary < amount) {
            amount = amount - salary;
            year++;
        }
        return year;
    }
}
