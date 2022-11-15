package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int s = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] != null) {
                array[s] = array[index];
                s++;
            }
        }
        for (int i = s; i < array.length; i++) {
            array[i] = null;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
