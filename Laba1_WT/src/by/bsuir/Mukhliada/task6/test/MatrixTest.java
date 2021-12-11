package by.bsuir.Mukhliada.task6.test;

import by.bsuir.Mukhliada.task6.util.Matrix;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void getMatrix1() {
        double[] sequence ={1, 2, 3, 4, 5};
        double[] expected ={1, 2, 3, 4, 5,
                            2, 3, 4, 5, 1,
                            3, 4, 5, 1, 2,
                            4, 5, 1, 2, 3,
                            5, 1, 2, 3, 4};
        double[][] actualMatrix = Matrix.getMatrix(sequence);
        double[] actual = new double[sequence.length * sequence.length];

        int destPos = 0;

        for (double[] row : actualMatrix) {
            System.arraycopy(row, 0, actual, destPos, row.length);
            destPos += row.length;
        }

        assertArrayEquals(expected, actual);
    }

    @Test
    void getMatrix2() {
        double[] sequence ={6, 3, 4, 8, 10, 5, 7, 1, 9, 2};
        double[] expected =
                {
                        6, 3, 4, 8, 10, 5, 7, 1, 9, 2,
                        3, 4, 8, 10, 5, 7, 1, 9, 2, 6,
                        4, 8, 10, 5, 7, 1, 9, 2, 6, 3,
                        8, 10, 5, 7, 1, 9, 2, 6, 3, 4,
                        10, 5, 7, 1, 9, 2, 6, 3, 4, 8,
                        5, 7, 1, 9, 2, 6, 3, 4, 8, 10,
                        7, 1, 9, 2, 6, 3, 4, 8, 10, 5,
                        1, 9, 2, 6, 3, 4, 8, 10, 5, 7,
                        9, 2, 6, 3, 4, 8, 10, 5, 7, 1,
                        2, 6, 3, 4, 8, 10, 5, 7, 1, 9,
                };

        double[][] actualMatrix = Matrix.getMatrix(sequence);
        double[] actual = new double[sequence.length * sequence.length];

        int destPos = 0;

        for (double[] row : actualMatrix) {
            System.arraycopy(row, 0, actual, destPos, row.length);
            destPos += row.length;
        }

        assertArrayEquals(expected, actual, 0.01);
    }

    @Test
    void getMatrix3() {
        double[] sequence ={1};
        double[] expected =
                {
                        1
                };

        double[][] actualMatrix = Matrix.getMatrix(sequence);
        double[] actual = new double[sequence.length * sequence.length];

        int destPos = 0;

        for (double[] row : actualMatrix) {
            System.arraycopy(row, 0, actual, destPos, row.length);
            destPos += row.length;
        }

        assertArrayEquals(expected, actual, 0.01);
    }

    @Test
    void getMatrix4() {
        double[] sequence ={};
        double[] expected =
                {

                };

        double[][] actualMatrix = Matrix.getMatrix(sequence);
        double[] actual = new double[sequence.length * sequence.length];

        int destPos = 0;

        for (double[] row : actualMatrix) {
            System.arraycopy(row, 0, actual, destPos, row.length);
            destPos += row.length;
        }

        assertArrayEquals(expected, actual, 0.01);
    }
}