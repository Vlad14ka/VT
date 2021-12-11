package by.bsuir.Mukhliada;

import java.util.Scanner;

public class Input {

    private static Scanner in = new Scanner(System.in);

    public static double numberDouble(){
        double result;

        while(true) {
            try {
                result = in.nextDouble();
                return result;
            } catch (Exception e) {
                in.next();
                System.out.print("Incorrect input.\nEnter number again: ");
            }
        }
    }

    public static int numberInt(){
        int result;

        while(true) {
            try {
                result = in.nextInt();
                return result;
            } catch (Exception e) {
                in.next();
                System.out.print("Incorrect input.\nEnter number again: ");
            }
        }
    }

    public static String stringWord() { return in.next(); }

    public static double[] arrayDouble() {
        System.out.println("Enter number of elements: ");
        int N = Input.numberInt();
        double numbers[] = new double[N];

        System.out.println("Enter array: ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Input.numberDouble();
        }

        return numbers;
    }

    public static int[] arrayInt() {
        System.out.println("Enter number of elements: ");
        int N = Input.numberInt();
        int numbers[] = new int[N];

        System.out.println("Enter array: ");
        for (int i = 0; i < N; i++) {
            numbers[i] = Input.numberInt();
        }

        return numbers;
    }
}
