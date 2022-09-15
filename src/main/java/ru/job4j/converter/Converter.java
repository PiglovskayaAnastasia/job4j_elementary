package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl1 = value / 70;
        return rsl1;
    }

    public static float rubleToDollar(float value) {
        float rsl2 = value / 60;
        return rsl2;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(750);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("750 rubles are " + dollar + " dollar.");
    }
}
