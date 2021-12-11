package by.bsuir.Mukhliada.task2.test;

import by.bsuir.Mukhliada.task2.util.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void containsPoint1() {
        boolean expected = true;
        boolean actual = Graph.containsPoint(-4, 3);
        assertEquals(expected, actual);
    }

    @Test
    void containsPoint2() {
        boolean expected = false;
        boolean actual = Graph.containsPoint(5, 5);
        assertEquals(expected, actual);
    }

    @Test
    void containsPoint3() {
        boolean expected = true;
        boolean actual = Graph.containsPoint(-1.7, 4.2);
        assertEquals(expected, actual);
    }

}