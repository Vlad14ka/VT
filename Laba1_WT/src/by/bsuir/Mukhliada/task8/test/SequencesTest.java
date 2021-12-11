package by.bsuir.Mukhliada.task8.test;

import by.bsuir.Mukhliada.task8.util.Sequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequencesTest {

    @Test
    void getPlacesToInsert1() {
        double firstSequence[] = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0};
        double secSequence[] = {1.0, 1.0, 1.0, 4.0, 4.0, 4.0, 14.3, 15.4, 20.0, 20.0};

        int actual[] = Sequences.getPlacesToInsert(firstSequence, secSequence);
        int expected[] = {1, 2, 3, 7, 8, 9, 21, 23, 24, 25};

        assertArrayEquals(actual, expected);
    }

    @Test
    void getPlacesToInsert2() {
        double secSequence[] = {1., 2., 3., 4., 5.};
        double firstSequence[] = {-10.1, -8.3, 1.0, 2.0, 2.33, 3.34, 4.3, 5.0, 6.2, 7.0, 9.0, 34.2 };

        int actual[] = Sequences.getPlacesToInsert(firstSequence, secSequence);
        int expected[] = {2, 4, 7, 9, 11};

        assertArrayEquals(actual, expected);
    }

}