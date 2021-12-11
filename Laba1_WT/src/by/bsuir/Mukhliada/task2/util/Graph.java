package by.bsuir.Mukhliada.task2.util;

public class Graph {
    public static boolean containsPoint(double x, double y){
        return (checkBotRect(x, y) || checkTopRect(x, y));
    }

    private static boolean checkTopRect(double x, double y){
        return (x >= -4.d && x <= 4.d) && (y <= 5.d && y >= 0.d);
    }

    private static boolean checkBotRect(double x, double y){
        return (x >= -6.d && x <= 6.d) && (y <= 0.d && y >= -3.d );
    }
}
