package lesson5_8_classes.transport;

import java.util.Scanner;

public class Passenger extends Ground {
    private String bodyType; //sedan
    private int numberOfPassenger; //pieces
    double hour;
    double distance;

    public Passenger() {
    }

    public Passenger(String bodyType, int numberOfPassenger) {
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public Passenger(int power, int maxSpeed, int weight, String brand, int numberOfWheels, double fullConsumption,
                     String bodyType, int numberOfPassenger) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fullConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void display() {
        System.out.printf("Информация легковой авто: \nМощность,кВт: %.1f; \nМаксимальная скорость,км/ч: %d; \nМасса,кг: %d; " +
                        "\nМарка: %s; \nКоличество колёс,шт: %d; \nРасход топлива,л/100км: %f; \nТип кузова: %s; " +
                        "\nКол-во пассажиров,шт: %d.", this.countPower(), this.getMaxSpeed(), this.getWeight(), this.getBrand(),
                this.getNumberOfWheels(), this.getFullConsumption(), this.getBodyType(),
                this.getNumberOfPassenger());
        System.out.println();
    }

    public void result() {
        System.out.println();
        System.out.println("Введите сколько времени вы ехали на машине,ч:");
        Scanner sc = new Scanner(System.in);
        hour = sc.nextDouble();
        distance = hour * this.getMaxSpeed();
        System.out.println("За время " + hour + " ч, автомобиль " + this.getBrand() + " двигаясь с максимальной скоростью " + this.getMaxSpeed() +
                " км/ч, проедет " + distance + " км и израсходует " + this.countFuel() + " литров топлива.");
        //sc.close();
    }

    private double countFuel() {
        return distance * this.getFullConsumption() / 100;
    }
}
