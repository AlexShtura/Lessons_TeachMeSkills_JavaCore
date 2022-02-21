package lesson5_8_classes.transport;

import java.util.Scanner;

public class Civil extends Air {
    private int numberOfPassenger; //pieces
    private boolean businessClass; //true/false

    public Civil() {

    }

    public Civil(int numberOfPassenger, boolean businessClass){
        this.numberOfPassenger = numberOfPassenger;
        this.businessClass = businessClass;
    }

    public Civil(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int numberOfPassenger, boolean businessClass){
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numberOfPassenger = numberOfPassenger;
        this.businessClass = businessClass;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public boolean getBusinessClass() {
        return businessClass;
    }

    public void display(){
        System.out.printf("Информация гражданский самолет: \nМощность,кВт: %.1f; \nМаксимальная скорость,км/ч: %d; \nМасса,кг: %d; " +
                        "\nМарка: %s; \nРазмах крыльев,м: %d; \nМинимальная длина взлётно-посадочной полосы для взлёта,км: %d; " +
                        "\nКол-во пассажиров,шт: %d; \nНаличие бизнес класса: %b.", this.countPower(), this.getMaxSpeed(),
                this.getWeight(), this.getBrand(), this.getWingspan(), this.getMinRunwayLength(), this.getNumberOfPassenger(),
                this.getBusinessClass());
    }
    public void countNumberOfPassenger() {
        System.out.println();
        System.out.println("Укажите количество пассажиров,шт:");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count <= this.getNumberOfPassenger()) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
        sc.close();
    }
}
