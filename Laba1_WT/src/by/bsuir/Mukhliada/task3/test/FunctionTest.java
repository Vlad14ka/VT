package by.bsuir.Mukhliada.task3.test;

import by.bsuir.Mukhliada.task3.util.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void solveTg1() {
        double[] expectedResults = {0, 1.55, -2.18, -0.14, 1.15, -3.38};
        double[][] actual = Function.solveTg(0, 5,1);
        double[] actualResults = new double[actual.length];

        for (int i = 0; i < actual.length; i++) {
            actualResults[i] = actual[i][1];
        }

        assertArrayEquals(actualResults, expectedResults, 0.01);
    }

    @Test
    void solveTg2() {
        double[] expectedResults = {1.55, 1.96, 2.57, 3.6, 5.79, 14.10, -34.23, -7.69, -4.28, -2.92, -2.18};
        double[][] actual = Function.solveTg(1, 2,0.1);
        double[] actualResults = new double[actual.length];

        for (int i = 0; i < actual.length; i++) {
            actualResults[i] = actual[i][1];
        }

        assertArrayEquals(actualResults, expectedResults, 0.01);
    }

    @Test
    void solveTg3() {
        double[] expectedResults = {-0.6483, 3.3805, 0, -3.3805, 0.6483};
        double[][] actual = Function.solveTg(-10, 10,5);
        double[] actualResults = new double[actual.length];

        for (int i = 0; i < actual.length; i++) {
            actualResults[i] = actual[i][1];
        }

        assertArrayEquals(actualResults, expectedResults, 0.0001);
    }
}