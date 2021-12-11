package by.bsuir.Mukhliada.task6.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task6.util.Matrix;

public class task6 {
    public static void main(String[] args) {
        double numbers[] = Input.arrayDouble();

        Print.matrix(Matrix.getMatrix(numbers));
    }
}
