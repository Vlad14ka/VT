package by.bsuir.Mukhliada.task9.runner;

import by.bsuir.Mukhliada.Input;
import by.bsuir.Mukhliada.task9.util.Ball;
import by.bsuir.Mukhliada.task9.util.Basket;

import java.util.ArrayList;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Balls count: ");
        int N = Input.numberInt();
        ArrayList<Ball> balls = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            System.out.println("Ball's color: ");
            String color = Input.stringWord();
            System.out.println("Ball's weight: ");
            double weight = Input.numberDouble();

            balls.add(new Ball(color, weight));
        }

        Basket basket = new Basket(balls);

        System.out.print("Basket weight: ");
        System.out.println(basket.getWeight());
        System.out.print("Blue balls in basket: ");
        System.out.println(basket.getBlueBallsCount());
    }
}
