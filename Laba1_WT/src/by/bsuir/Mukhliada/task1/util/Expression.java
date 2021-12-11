package by.bsuir.Mukhliada.task1.util;

public class Expression {
    public static double solve(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - (2 * x)/(1 + x*x * y*y))) + x;
    }
}