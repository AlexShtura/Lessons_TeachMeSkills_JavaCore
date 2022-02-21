package lesson5_8_classes.com.company.vehicles;

import lesson5_8_classes.com.company.details.Engine;
import lesson5_8_classes.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry() {
    }

    public Lorry(String model, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(model, type, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
