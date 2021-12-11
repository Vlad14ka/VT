package by.bsuir.Mukhliada.task4.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.Print;
import by.bsuir.Mukhliada.task4.util.PrimeNumbers;

public class task4 {
    public static void main(String[] args){

        int numbers[] = Input.arrayInt();

        System.out.println("Indexes:");

        Print.array(PrimeNumbers.getPrimeNumbersIndexes(numbers));
    }
}
