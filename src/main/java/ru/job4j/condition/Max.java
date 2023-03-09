package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int top) {
        return max(left, max(right, top));
    }

    public static int max(int left, int right, int top, int fourth) {
        return max(left, max(right, top, fourth));
    }

    public static void main(String[] args) {
        int total = Max.max(10, 16);
        System.out.println(total);
    }
}
