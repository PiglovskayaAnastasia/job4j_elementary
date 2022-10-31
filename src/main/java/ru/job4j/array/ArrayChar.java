package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int minlength = word.length;
        if (word.length > pref.length) {
            minlength = pref.length;
        }
        for (int i = 0; i < minlength; i++) {
            if (word[i] == pref[i]) {
                result = result;
            } else {
                result = false;
            }
        }
        return result;
    }
}
