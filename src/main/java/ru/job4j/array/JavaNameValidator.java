package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Character.isUpperCase(name.charAt(0))) {
            valid = false;
        }
        for (int i = 0; i < name.length() && valid == true; i++) {
           if (isLowerLatinLetter(name.codePointAt(i))) {
                valid = true;
           } else if (isUpperLatinLetter(name.codePointAt(i))) {
                valid = true;
           } else if (isSpecialSymbol(name.codePointAt(i))) {
                valid = true;
           } else if (Character.isDigit(name.charAt(i))) {
                valid = true;
           } else {
               valid = false;
               break;
           }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        if (code == 36 || code == 95) {
                valid = true;
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        if (code >= 65 && code <= 90) {
            valid = true;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        if (code >= 97 && code <= 122) {
            valid = true;
        }
        return valid;
    }
}
