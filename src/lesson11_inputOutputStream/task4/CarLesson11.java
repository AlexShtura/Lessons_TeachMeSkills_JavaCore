package lesson11_inputOutputStream.task4;

import java.io.Serializable;

public class CarLesson11 implements Serializable {
    private String model;
    private int maxSpeed;
    private int price;

    public CarLesson11(){
    }

    public CarLesson11(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
/*
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }*/

}
