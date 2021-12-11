package by.bsuir.Mukhliada.task3.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task3.util.Function;

public class task3 {
    public static void main(String[] args) {
        System.out.print("Enter a: ");
        double a = Input.numberDouble();
        System.out.print("Enter b: ");
        double b = Input.numberDouble();
        System.out.print("Enter h: ");
        double h = Input.numberDouble();

        Print.table(Function.solveTg(a, b, h));
    }
}
