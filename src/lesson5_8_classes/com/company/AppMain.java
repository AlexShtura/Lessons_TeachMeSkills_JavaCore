package lesson5_8_classes.com.company;

import lesson5_8_classes.com.company.details.Engine;
import lesson5_8_classes.com.company.professions.Driver;
import lesson5_8_classes.com.company.vehicles.Car;

/*Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и
Driver в пакете com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
Класс Engine содержит поля - мощность, производитель.
Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят
на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и
моторе. Создать производный от Car класс  - Lorry (грузовик), характеризуемый также
грузоподъемностью кузова. Создать производный от Car класс - SportCar, характеризуемый
также предельной скоростью. Пусть класс Driver расширяет класс Person.*/

public class AppMain {
    public static void main(String[] args) {
        Driver driver1 = new Driver(18, "SAM", 20);
        Engine engine1 = new Engine(500, "Audi");

        Car car = new Car("Fort", "sedan", 2000, driver1, engine1);
        car.printInfo();
    }
}
