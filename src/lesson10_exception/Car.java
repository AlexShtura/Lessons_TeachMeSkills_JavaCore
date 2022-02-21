package lesson10_exception;

import java.util.Random;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String model, int speed, int price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() {
        Random r = new Random();
        int number = r.nextInt(21);
        if (number % 2 == 0) {
            System.out.println("");
        } else {
            System.out.println("");
        }
    }
}
