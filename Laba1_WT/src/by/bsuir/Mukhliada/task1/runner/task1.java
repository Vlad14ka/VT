package by.bsuir.Mukhliada.task1.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.task1.util.Expression;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Enter x: ");
        double x = Input.numberDouble();
        System.out.print("Enter y: ");
        double y = Input.numberDouble();

        System.out.println("Answer: " + Expression.solve(x, y));
    }
}
