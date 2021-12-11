package by.bsuir.Mukhliada.task6.util;

public class Matrix {
    public static double[][] getMatrix(double[] numbers) {
        double[][] matrix = new double[numbers.length][numbers.length];
        int pos = 0, srcPos = 0, destPos = 0, numOfElems = numbers.length;

        for (double row[] : matrix) {
            System.arraycopy(numbers, srcPos + pos, row, destPos, numOfElems - pos);
            System.arraycopy(numbers, srcPos, row, numOfElems - pos, pos++);
        }

        return matrix;
    }
}