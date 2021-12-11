package by.bsuir.Mukhliada.task4.util;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    public static int[] getPrimeNumbersIndexes(int numbers[]) {
        List<Integer> indexes = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                indexes.add(i);
            }
        }

        int _indexes[] = new int[indexes.size()];
        int i = 0;

        for (int index : indexes) {
            _indexes[i++] = index;
        }

        return _indexes;
    }

    private static boolean isPrime(int number) {
        int i = 5;

        if (number <= 1)
            return false;
        else if (number <= 3)
            return true;
        else if (number % 2 == 0 || number % 3 == 0)
            return false;

        while (i * i <= number){
            if (number % i == 0 || number % (i + 2) == 0)
                return false;
            i += 6;
        }

        return true;
    }
}
