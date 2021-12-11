package by.bsuir.Mukhliada.task1.test;

import by.bsuir.Mukhliada.task1.util.Expression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void testCalculate1() {
        double expected = 0.5;
        double actual = Expression.solve(0,0);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testCalculate2() {
        double expected = 1.57;
        double actual = Expression.solve(1,0);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    void testCalculate3() {
        double expected = 1.5;
        double actual = Expression.solve(1,-1);
        assertEquals(expected, actual, 0.01);
    }
}