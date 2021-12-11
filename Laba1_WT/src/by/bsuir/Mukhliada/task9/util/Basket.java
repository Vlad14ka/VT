package by.bsuir.Mukhliada.task9.util;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> ballsInBasket;

    public Basket(ArrayList<Ball> balls) {
        if (balls != null)
            this.ballsInBasket = new ArrayList<Ball>(balls);
        else
            this.ballsInBasket = new ArrayList<Ball>();
    }

    public Basket() {
        ballsInBasket = new ArrayList<>();
    }

    public double getWeight() {
        double totalWeight = 0.;

        for (Ball ball : ballsInBasket) {
            totalWeight += ball.getWeight();
        }

        return totalWeight;
    }

    public void addBall(Ball ... balls) {
        for (Ball ball : balls) {
            if (ball != null) {
                ballsInBasket.add(ball);
            }
        }
    }

    public int getBlueBallsCount() {
        final String color = "Blue";
        int count = 0;
        String currentColor;

        for (Ball ball : ballsInBasket) {
            currentColor = ball.getColor();
            if (currentColor.equalsIgnoreCase(color)) {
                count++;
            }
        }

        return count;
    }
}
