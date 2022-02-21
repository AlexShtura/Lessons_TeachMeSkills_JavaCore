package lesson5_8_classes.transport;

import java.util.Scanner;

public class Cargo extends Ground {
    private int carryingCapacity; //ton Грузоподъёмность

    public Cargo() {
    }

    public Cargo(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Cargo(int power, int maxSpeed, int weight, String brand, int numberOfWheels, double fullConsumption,
                 int carryingCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fullConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void display() {
        System.out.printf("Информация грузовой авто: \nМощность,кВт: %.1f; \nМаксимальная скорость,км/ч: %d; \nМасса,кг: %d; " +
                        "\nМарка: %s; \nКоличество колёс,шт: %d; \nРасход топлива,л/100км: %f; \nГрузоподъёмность,тон: %d; ",
                this.countPower(), this.getMaxSpeed(), this.getWeight(), this.getBrand(), this.getNumberOfWheels(),
                this.getFullConsumption(), this.getCarryingCapacity());
    }

    public void countCargo() {
        System.out.println();
        System.out.println("Укажите количество груза,тон:");
        Scanner sc = new Scanner(System.in);
        int mass = sc.nextInt();
        if (mass <= this.getCarryingCapacity()) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
        //sc.close();
    }
}
