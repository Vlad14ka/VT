package by.bsuir.Mukhliada.task9.test;

import by.bsuir.Mukhliada.task9.util.Ball;
import by.bsuir.Mukhliada.task9.util.Basket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketBallTest {

    @Test
    void getWeight() {
        ArrayList<Ball> basketList = new ArrayList<Ball>();
        basketList.add(new Ball("red", 4.5));
        basketList.add(new Ball( "Blue", 5.5));
        basketList.add(new Ball( "Red", 14.2));
        basketList.add(new Ball( "Black",1.3));
        basketList.add(new Ball( "blue", 7.8));
        basketList.add(new Ball( "bLuE",11.1));

        Basket basket = new Basket(basketList);
        double actual = basket.getWeight();
        double expected = 44.4;

        assertEquals(expected, actual, 0.01);
    }

    @Test
    void getBlueBallsCount() {

        ArrayList<Ball> basketList = new ArrayList<Ball>();

        basketList.add(new Ball("red", 4.5));
        basketList.add(new Ball( "Blue", 5.5));
        basketList.add(new Ball( "Red", 14.2));
        basketList.add(new Ball( "Black",1.3));
        basketList.add(new Ball( "blue", 7.8));
        basketList.add(new Ball( "bLuE",11.1));

        Basket basket = new Basket(basketList);
        int actual = basket.getBlueBallsCount();
        int expected = 3;

        assertEquals(expected, actual);
    }
}