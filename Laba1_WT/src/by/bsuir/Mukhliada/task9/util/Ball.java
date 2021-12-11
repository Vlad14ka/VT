package by.bsuir.Mukhliada.task9.util;

public class Ball {

    private String color;
    private double weight;

    public Ball(String color, double weight) {

        if (weight < 0)
            throw new IllegalStateException();

        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}