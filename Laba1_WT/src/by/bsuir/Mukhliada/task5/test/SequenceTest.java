package by.bsuir.Mukhliada.task5.test;

import by.bsuir.Mukhliada.task5.util.Sequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    @Test
    void getMinElementsForDel1() {
        int[] sequence = {-1, 2, 4, 3, 6, 3, 18};
        int expected = 2;
        int actual = Sequence.getMinElementsForDel(sequence);
        assertEquals(expected, actual);
    }

    @Test
    void getMinElementsForDel2() {
        int[] sequence = {-1, 2, 4, -6, -5, -4, -3};
        int expected = 3;
        int actual = Sequence.getMinElementsForDel(sequence);
        assertEquals(expected, actual);
    }

    @Test
    void getMinElementsForDel3() {
        int[] sequence = {21, 22, 11, 15, 18, -11, -10};
        int expected = 4;
        int actual = Sequence.getMinElementsForDel(sequence);
        assertEquals(expected, actual);
    }

    @Test
    void getMinElementsForDel4() {
        int[] sequence = {6, 3, 4, 8, 10, 5, 7, 1, 9, 2};
        int expected = 5;
        int actual = Sequence.getMinElementsForDel(sequence);
        assertEquals(expected, actual);
    }

    @Test
    void getMinElementsForDel5() {
        int[] sequence = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int expected = 10;
        int actual = Sequence.getMinElementsForDel(sequence);
        assertEquals(expected, actual);
    }
}