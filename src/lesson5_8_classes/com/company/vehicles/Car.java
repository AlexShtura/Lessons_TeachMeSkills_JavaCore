package lesson5_8_classes.com.company.vehicles;

import lesson5_8_classes.com.company.details.Engine;
import lesson5_8_classes.com.company.professions.Driver;

public class Car {
    private String model;
    private String type;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String model, String type, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Стоп!");
    }

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }

    public void printInfo() {
        System.out.printf("Марка автомобиля\nКласс автомобиля\nВес\nводитель\nмотор\n ", this.getModel(), this.getType(), this.getWeight(), this.getDriver(), this.getEngine());
    }
}
