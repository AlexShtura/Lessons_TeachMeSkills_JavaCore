package lesson5_8_classes.com.company.vehicles;

import lesson5_8_classes.com.company.details.Engine;
import lesson5_8_classes.com.company.professions.Driver;

public class SportCar extends Car {
    private double speed;

    public SportCar() {
    }

    public SportCar(String model, String type, int weight, Driver driver, Engine engine, double speed) {
        super(model, type, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
