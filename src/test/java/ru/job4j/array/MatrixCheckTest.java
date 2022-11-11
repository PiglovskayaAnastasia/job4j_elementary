package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}};
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasNotMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '}};
        int row = 0;
        boolean result = MatrixCheck.monoHorizontal(board, row);
        assertThat(result).isFalse();
    }
}