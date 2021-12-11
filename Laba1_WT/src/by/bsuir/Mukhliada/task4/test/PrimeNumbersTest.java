package by.bsuir.Mukhliada.task4.test;

import by.bsuir.Mukhliada.task4.util.PrimeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void getPrimeNumbersIndexes1() {
        int[] sequence = {0, 5, 1, 11, 2, 3};
        int[] expected = {1, 3, 4, 5};
        int[] actual = PrimeNumbers.getPrimeNumbersIndexes(sequence);

        assertArrayEquals(expected, actual);
    }

    @Test
    void getPrimeNumbersIndexes2() {
        int[] sequence = {-1, -1, -1, -2, -2, -3};
        int[] expected = {};
        int[] actual = PrimeNumbers.getPrimeNumbersIndexes(sequence);

        assertArrayEquals(expected, actual);
    }

    @Test
    void getPrimeNumbersIndexes3() {
        int[] sequence = {0, 245, 1221, -11, -32, 13335, 18, 23};
        int[] expected = {7};
        int[] actual = PrimeNumbers.getPrimeNumbersIndexes(sequence);

        assertArrayEquals(expected, actual);
    }
}