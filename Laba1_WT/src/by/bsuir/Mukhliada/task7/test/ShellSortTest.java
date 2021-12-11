package by.bsuir.Mukhliada.task7.test;

import by.bsuir.Mukhliada.task7.util.ShellSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ShellSortTest {

    @Test
    void sort1() {
        double expected[] = {0., 8., 4., 12., 2., 10., 6., 14., 1., 9., 5., 13., 3., 11., 7., 15.};
        double actual[] = ShellSort.sort(expected);
        Arrays.sort(expected);

        assertArrayEquals(actual, expected);
    }

    @Test
    void sort2() {
        double expected[] = {6., 3., 4., 8., 10., 5., 7., 1., 9., 2.};
        double actual[] = ShellSort.sort(expected);
        Arrays.sort(expected);

        assertArrayEquals(actual, expected);
    }

    @Test
    void sort3() {
        double expected[] = {6.2, 3.34, 4.3, -8.3, -10.1, 5., 7., 1., 9., 2., 2.33, 34.2};
        double actual[] = ShellSort.sort(expected);
        Arrays.sort(expected);

        assertArrayEquals(actual, expected);
    }
}