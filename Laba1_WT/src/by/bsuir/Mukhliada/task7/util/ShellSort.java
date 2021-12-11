package by.bsuir.Mukhliada.task7.util;

public class ShellSort {
    public static double[] sort(double[] array) {
        double temp = 0;
        int i = 0;

        while (i < array.length - 1) {

            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                if (i != 0)
                    i--;
            }
        }

        return array;
    }
}