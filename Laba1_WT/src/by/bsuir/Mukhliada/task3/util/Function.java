package by.bsuir.Mukhliada.task3.util;

public class Function {
    public static double[][] solveTg(double a, double b, double h){
        int length = (int) Math.floor((b - a) / h) + 1;
        double table[][] = new double[length][2];
        double currX = a;

        for (int i = 0; i < length; i++){
            table[i][0] = currX;
            table[i][1] = Math.tan(currX);
            currX += h;
        }

        return table;
    }
}
