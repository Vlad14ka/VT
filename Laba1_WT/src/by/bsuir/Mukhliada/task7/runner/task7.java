package by.bsuir.Mukhliada.task7.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task7.util.ShellSort;

public class task7 {
    public static void main(String[] args) {
        double numbers[] = Input.arrayDouble();

        Print.array(ShellSort.sort(numbers));
    }
}
