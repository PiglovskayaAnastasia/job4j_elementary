package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RollBackArrayTest {

    @Test
    public void whenArray() {
        int[] array = new int[] {};
        int[] expected = new int[] {};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] array = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenFull() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTheSame() {
        int[] array = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] result = RollBackArray.rollback(array);
        assertThat(result).containsExactly(expected);
    }
}