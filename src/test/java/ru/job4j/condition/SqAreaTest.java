package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K5Square3dot47() {
        int p = 10;
        double k = 5;
        double expected = 3.47;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Square2dot56() {
        int p = 8;
        double k = 4;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}