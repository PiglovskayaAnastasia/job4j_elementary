package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax10To15Then15() {
        int left = 10;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To8Then9() {
        int left = 9;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To10To50Then50() {
        int left = 10;
        int right = 10;
        int top = 50;
        int result = Max.max(left, right, top);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1To5Then5() {
        int left = 1;
        int right = 1;
        int top = 5;
        int result = Max.max(left, right, top);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1To5To25Then25() {
        int left = 1;
        int right = 1;
        int top = 5;
        int fourth = 25;
        int result = Max.max(left, right, top, fourth);
        int expected = 25;
        assertThat(result).isEqualTo(expected);
    }
}