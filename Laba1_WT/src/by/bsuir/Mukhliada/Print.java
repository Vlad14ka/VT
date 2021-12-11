package by.bsuir.Mukhliada;

import java.util.ArrayList;

public class Print {

    public static void table(double table[][]) {

        for (int i = 0; i < table.length; i++) {
            System.out.print("|");

            for (int j = 0; j < table[i].length; j++) {
                System.out.format("%10.3f|", table[i][j]);
            }

            System.out.println();
        }
    }

    public static void array(int array[]) {
        for (int number : array ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void array(double array[]) {
        for (double number : array ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void matrix(double matrix[][]) {

        for (double row[] : matrix) {

            for (Double element : row) {
                System.out.format("%5.2f ", element);
            }

            System.out.println();
        }
    }

    public static void books(ArrayList books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }

        System.out.println();
    }

}
