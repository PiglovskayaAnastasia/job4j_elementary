package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(750);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("750 rubles are " + dollar + " dollar.");
        float in = 140;
        float in2 = 750;
        float expected = 2;
        float expected2 = 12.5f;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("750 rubles are 12.5. Test result : " + passed2);
    }
}
